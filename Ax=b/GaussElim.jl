#starts by making aug matrix [A|b]'s A part upper triangular
#with 1s one the diagonal through row operations
#then uses backtracking alg as described beow to solve the matrix

begin

b = [2.0,4,6]
A = [[2.0,2,3] [4,12,6] [7,8,9]]
dim = size(A,1) #assumed square
eqs = [1:dim]

for i=1:dim


	b[i] = b[i] / A[i,i]
	A[i,:] =  A[i,:] ./ A[i,i]


		for j=i+1:dim
			indexedVal = A[j,i]
			vecVal = b[i]

			val = (A[j,i] * b[i])
			b[j] = b[j] - val
			A[j,:] = A[j,:] - (A[j,i] .* A[i,:])

		end
end

#back tracker
# idea: A is now upper triangular with leading 1s
# therefore we have a matrix where each row xt has
#     0 0 0 0... xt st+1 ...sn = bt
#	=> xt = b - st+1 (bt+1) -... - sn(bn)
#   => we can solve all xt if we start with t = n and go to t = 1
#
		sols = zeros(dim)
		for i =1:dim
			x = dim-i+1
			sols[x] += b[x] #add the solution

			for j = 1:i-1 #how many x0,x1.... xn-2 may get suntracted
				sols[x] -= sols[dim - j + 1] * A[x,dim - j + 1]
			end

		end

println(sols)

end
