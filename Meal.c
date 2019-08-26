#include<stdio.h>
int main()
{
    struct mess
    {
        char name[30];
        int per_person_pay, meal_count;
        double due, diposit;
    };

    struct mess M[30];

    int num_of_mess_member, i, total_meal_count, total_pay;

    double meal_rate, per_person_cost[30];

    printf("Enter the number of mess members:\n");
    scanf("%d", &num_of_mess_member);


    printf("Enter the name of mess members and their total pay:(Example:X Y)\n");
    total_pay=0;
    for(i=1; i<=num_of_mess_member; i++)
    {
        scanf("%s %d", M[i].name, &M[i].per_person_pay);
        total_pay=total_pay+M[i].per_person_pay;
    }

    total_meal_count=0;

    for(i=1; i<=num_of_mess_member; i++)
    {
        printf("How many meals %s had?\n", (M[i].name));
        scanf("%d", &M[i].meal_count);
        total_meal_count=total_meal_count+M[i].meal_count;
    }

    meal_rate=(double)total_pay/total_meal_count;

    for(i=1; i<=num_of_mess_member; i++)
        per_person_cost[i]=(double)meal_rate*M[i].meal_count;

    for(i=1; i<=num_of_mess_member; i++)
    {
        if(per_person_cost[i]>M[i].per_person_pay)
        {
            M[i].diposit=0;
            M[i].due=(double)(-1)*(M[i].per_person_pay-per_person_cost[i]);
        }
        else if(per_person_cost[i]<M[i].per_person_pay)
        {
            M[i].due=0;
            M[i].diposit=(double)M[i].per_person_pay-per_person_cost[i];
        }
        else
        {
            M[i].due=0;
            M[i].diposit=0;
        }

    }

    printf("\n--------------------------------------------------------------------------------\n");

    printf("\nTotal Paid=%d\n\n", total_pay);

    printf("Total Meal=%d\n\n", total_meal_count);

    printf("Meal Rate: %0.2lf\n\n", meal_rate);

    printf("Name\t\tPaid\t\tMeal Count\tDue\t\tDiposit\n");

    for(i=1; i<=num_of_mess_member; i++)
    {
        printf("%d. %s\t%d\t\t%d\t\t%0.2lf\t\t%0.2lf\n", i, M[i].name, M[i].per_person_pay, M[i].meal_count, M[i].due, M[i].diposit);
    }

    printf("\n--------------------------------------------------------------------------------\n");

    return 0;
}
