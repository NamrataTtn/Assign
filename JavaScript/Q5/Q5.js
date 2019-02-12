
var list =[
    {
        'name': 'Abc',
        'age': 26,
        'salary': 50000,
        'dob':'1-1-1993'
    },
    {
        'name': 'BCD',
        'age': 24,
        'salary': 800,
        'dob':'1-1-1995'
    },
    {
        'name': 'XYZ',
        'age': 26,
        'salary': 60000,
        'dob':'1-1-1993'
    },
    {
        'name': 'PQR',
        'age': 30,
        'salary': 27000,
        'dob':'1-1-1989'
    },
];

function call() {
    for (let i in list) {
        console.log(list[i]);


    }
}
function salary(){
    console.log("employees with salary more than 5000");

    for(let i in list){
        if(list[i].salary>5000){
           console.log(list[i]);
        }
    }
}
function salaryInc(){
    console.log("Increased salary");
    for(let i in list)
    {
        if((list[i].age>20)&& (list[i].salary<1000)){

            list[i].salary=list[i].salary+(5*list[i].salary);
            console.log(list[i]);

        }

    }
}

function groupByAge() {
     var l=[];
    for (let i in list)
    {
        if(l.indexOf(list[i].age)==-1)
        {
            l.push(list[i].age);
        }
    }
    for(let i in l)
    {
        console.log("employees in the age group"+l[i]);
        for(let j in list)
        {
            if(list[j].age==l[i]){
                console.log(list[j]);

            }
        }
    }

}
