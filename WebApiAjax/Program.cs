using WebApiAjax;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddRazorPages();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Error");
}
app.UseStaticFiles();

app.UseRouting();

app.MapGet("/math",
 (int x, int y) => new CalcResult()
 {
     Sum = x + y,
     Difference = x - y,
     Product = x * y,
     Quotient = x / y
 });

app.UseStaticFiles();

app.UseAuthorization();

app.MapRazorPages();

app.Run();
