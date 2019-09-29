/**
 * 
 */
//Function to find precedence of the operator
function precedence(op) {
    if(op == '+' || op == '-')
        return 1;
    if(op == '*' || op == '/')
        return 2;
    return 0;
}

//Function to preform the arithmetic operation
function applyOp(a, b, op) {
    if(op == '+')
        return a + b;
    if(op == '-')
        return a - b;
    if(op == '*')
        return a * b;
    if(op == '/')
        return a / b;
}

//Function to evaluate the expression
function evaluate(token) {
    //Stack to store values
    values = [];
    //Stack to store operators
    ops = [];
    i = 0;

    while(i < token.length) {
        //Skip whitespace
        if(token[i] == '') {
            i += 1;
            continue;
        }
        //If opening brace, push it to ops stack
        if(token[i] == '(') {
            ops.push(token[i]);
        }
        //If number, push to values stack
        if(!isNaN(Number(token[i])) && typeof(parseInt(token[i])) == 'number') {
            let val = 0;
            //If more than one digit
            while(i < token.length && !isNaN(Number(token[i])) && typeof(parseInt(token[i])) == 'number') {
                val = (val * 10) + parseInt(token[i]);
                i += 1;
            }
            values.push(val);
        }
        //If closing brace, solve the entire brace
        if(token[i] == ')') {
            while(ops.length != 0 && ops[ops.length - 1] != '(') {
                let val2 = values.pop();
                let val1 = values.pop();
                let op = ops.pop();
                values.push(applyOp(val1, val2, op));
            }
            //Pop opening brace
            ops.pop();
        }
        //if token is an operator
        if(token[i] == '+' || token[i] == '-' || token[i] == '*' || token[i] == '/') {
            //While top of ops has same or greater precedence to current token, which is an operator.
            //Apply operator on top of ops to top two elements in value stack.
            while(ops.length != 0 && precedence(ops[ops.length - 1]) >= precedence(token[i])) {
                let val2 = values.pop();
                let val1 = values.pop();
                let op = ops.pop();
                values.push(applyOp(val1, val2, op));
            }
            ops.push(token[i]);
        }
        i += 1;
    }
    //Entire expression has been parsed. Apply remaining ops to remaining values
    while(ops.length != 0) {
        let val2 = values.pop();
        let val1 = values.pop();
        let op = ops.pop();
        values.push(applyOp(val1, val2, op));
    }
    return values[values.length - 1];
}