#include<stdio.h>
struct node
{
	int key;
	struct node *left;
	struct node *right;
};
struct node * insertIntoBST(struct node *root,int value)
{
	struct node *currentNode=root;
	char ch='y';
	while(ch==y || ch=='Y')
	{
		if(value<currentNode->key)
		{
			if(currentNode->left==null)
			{
				currentNode->left=
				break;
			}
			else 
				currentNode=currentNode>left;
		}
		else
		{
			if(currentNode->right==null)
			{
				currentNode->right=
				break;
			}
			else 
				currentNode=currentNode>right;
		}
		printf("\nWANNA ENTER MORE NODES? PRESS Y ELSE PRESS N\n");
		scanf("%c",&ch);
	}
	return root;			
}
void InOrderTraversal(struct node *root)
{
	if(root==null)
		return;
	InOrderTraversal(tree->left);
	printf("%d	",tree->key);
	InOrderTraversal(tree->right);
}

void PreOrderTraversal(struct node *root)
{
	if(root==null)
		return;
	printf("%d	",tree->key);
	PreOrderTraversal(tree->left);
	PreOrderTraversal(tree->right);
}

void PostOrderTraversal(struct node *root)
{
	if(root==null)
		return;
	PostOrderTraversal(tree->left);	
	PostOrderTraversal(tree->right);
	printf("%d	",tree->key);
}
int contains(struct node *root,int value)
{
	struct node *currentNode=root;
	while(currentNode!=NULL)
	{
		if(value<currentNode->key)
			currentNode=currentNode->left;
		else if(value>currentNode->key)
			currentNode=currentNode->right;
		else
			return 1;			
	}
	return 0
}
