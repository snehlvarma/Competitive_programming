function lengthOfLastWord(str) {
  if(str == '') {return 0;}
  let myArr = str.trim().split(' ');
  return (myArr[myArr.length-1]).length;
}
