#∫ from a to b of f(x)
#


function f(x)
    x^2
end

a = 2
b = 4

#n must be even!!
n = 1000


integralValue = 0.0
deltaX = (b-a)/n

integralValue += f(a)
integralValue += f(b)

for i in 1:n-1
    if i % 2 == 1
        global integralValue += 4*f(a + (i * deltaX))
    else
        global integralValue += 2*f(a + (i * deltaX))
    end
end

integralValue = integralValue * deltaX / 3

println(integralValue)
