#include<stdio.h>
#include<math.h>
#define maxSize 100

int size,tree[maxSize];
void swap(int *a,int *b) //call by reference 
{
	int c=*a;
	*a=*b;
	*b=c;
}
int parent(int i) 
{
	return floor(i/2);
}
int leftChild(int i) 
{
	return 2*i;
}
int rightChild(int i)
{
	return 2*i+1;
}
void invertBinaryTree(int n) 
{

	if(n>size)
		return;
	swap(&tree[leftChild(n)],&tree[rightChild(n)]);
	invertBinaryTree(leftChild(n));
	invertBinaryTree(rightChild(n));
}
void display()
{
	int i;
	for(i=1;i<=size;i++)
		printf("%d	",tree[i]);
}
int main()
{
	printf("ENTER THE NUMBER OF NODES OF THE TREE\n");
	scanf("%d",&size);
	int i;
	for(i=1;i<=size;i++)
	{
		printf("\nENTER THE %dth NODE\n",i);
		scanf("%d",&tree[i]);
	}
	invertBinaryTree(1);
	display();
	return 0;
}
