begin

####
# Parameters
# point - the point @ which to find derivative
# delta - the the tiny value used to approx the lim
# f(x) - the function be diffed
#####
point = 4
delta = .0001
function f(x)
    x^2
end


derivativeFWD = (f(point + delta) - f(point)) / delta

println(derivativeFWD)

end
