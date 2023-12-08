#include <stdio.h>

void draw_tree(int height)
{
    if (height == 0)
        return;

    for (int i = 0; i < height; i++)
        printf(" ");
    printf("|\n");

    draw_tree(height - 1);
}

int main()
{
    int height;
    printf("Enter the height of the tree: ");
    scanf("%d", &height);

    draw_tree(height);

    return 0;
}
