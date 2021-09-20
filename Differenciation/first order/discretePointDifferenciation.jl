begin

# takes a fxn f(x) and a number of sample points n
# evenly space over the interval [periodStart, periodEnd)
# calculates the derivative at each point to populate the vector dxdy
#

function f(x)
    x^2
end

n = 1000
periodStart = 4
periodEnd = 10
# periodStart < periodEnd

delta = (  periodEnd - periodStart ) / n

#init point arrays
x = Vector{Float64}(undef, n)
y = Vector{Float64}(undef, n)

dxdy = Vector{Float64}(undef, n)

#populate points
for i in 1:n
    x[i] = periodStart + (i-1) * delta
    y[i] = f(periodStart + (i-1) * delta)
end

#central diff for all points between
for i in 2:n-1
    dxdy[i] = ((y[i+1] - y[i]) + (y[i] - y[i-1])) / (2 * delta)
end

#formulas for bwd/fwd methd shows how this is simply an average of the two
#derivativeFWD = (f(point + delta) - f(point)) / delta

dxdy[1] = (y[2] - y[1]) / delta

#derivativeBWD = (f(point) - f(point - delta)) / delta
dxdy[n] = (y[n] - y[n-1]) / delta
end
