const removeNthFromEnd = function (head, n) {
  // find the length of the list
  let length = 0;
  let currentNode = head;

  while (currentNode) {
    length++;
    currentNode = currentNode.next;
  }

  if (length <= 1) {
    return null;
  }

  const rmNextNode = length - n;
  let counter = 1; // initialize counter
  currentNode = head;

  // node to be removed: 0th (does not exists as counter starts from 1)
  if (rmNextNode < 1) {
    return currentNode.next;
  }

  while (counter < length) {
    if (counter === rmNextNode) {
      const nodeToBeRemoved = currentNode.next;
      currentNode.next = nodeToBeRemoved.next;
    }

    counter++;
    currentNode = currentNode.next;
  }

  return head;
};
