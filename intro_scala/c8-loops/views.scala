val nums = Array.fill(180)(math.random)
// we want to filter out the array which square
// values are less than 0.25

// these gives three instances of nums one after each dot method
nums.map(x=>x*x).filter(_ < 0.25).sum

//by adding a views we make an efficient call 
nums.view.map(x=>x*x).filter(_ < 0.25).sum
