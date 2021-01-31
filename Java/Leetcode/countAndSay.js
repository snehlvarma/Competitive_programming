const countAndSay = (num) => {
  if (num === 1) return '1'
  num = countAndSay(num-1).split('')
  let result = ''
  
  let counter = 1
  num.forEach((n, inx) => {
    if (n === num[inx+1]) counter++ 
    else result += counter + n, counter = 1
  })
  
  return result
};
