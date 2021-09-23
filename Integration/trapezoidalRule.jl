#∫ from a to b of f(x)
#

#Parameters
function f(x)
    x^2
end

a = 2
b = 4
n = 1000

#value of the integral ∫ from a to b of f(x)
intValue = 0.0
deltaX = (b-a)/n

intValue += f(a)
intValue += f(b)

for i in 1:n-1
    global intValue += 2*f(a + (i * deltaX))
end

intValue = intValue * deltaX / 2

println(intValue)
