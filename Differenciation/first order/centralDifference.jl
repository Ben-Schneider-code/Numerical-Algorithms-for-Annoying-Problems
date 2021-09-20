# This method averages the backwards and forwards techniques to acheiveless error
# By taylor expansion we can see that the error is O(delta^2)
#  => a significant improvement on the backwards/fwd error of O(delta)
#


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

#formulas for bwd/fwd methd shows how this is simply an average of the two
#derivativeFWD = (f(point + delta) - f(point)) / delta
#derivativeBWD = (f(point) - f(point - delta)) / delta


deritativeCEN =
((f(point + delta) - f(point)) + (f(point) - f(point - delta))) / (2 * delta)

println(derivativeCEN)

end
