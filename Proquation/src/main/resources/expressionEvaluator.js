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

//Function to evaluate the expression using stack
function evaluate(token) {
    values = [];
    ops = [];
    i = 0;
    j=0;
    isValid=1;
    result= "result";
    while(j<token.length){
    	if(j+1<token.length){
    		if((token[j]=='+' && token[j+1]=='+') || (token[j]=='-' && token[j+1]=='-') || (token[j]=='*' && token[j+1]=='*') ||(token[j]=='\\' && token[j+1]=='\\')){
        		isValid= 0;
        	}
    	}
    	
    	j++;			
    }
    if(isValid){
    	 while(i < token.length) {
    	        if(token[i] == '') {
    	            i += 1;
    	            continue;
    	        }
    	        if(token[i] == '(') {
    	            ops.push(token[i]);
    	        }
    	        if(!isNaN(Number(token[i])) && typeof(parseInt(token[i])) == 'number') {
    	            let val = 0;
    	            while(i < token.length && !isNaN(Number(token[i])) && typeof(parseInt(token[i])) == 'number') {
    	                val = (val * 10) + parseInt(token[i]);
    	                i += 1;
    	            }
    	            values.push(val);
    	        }
    	        if(token[i] == ')') {
    	            while(ops.length != 0 && ops[ops.length - 1] != '(') {
    	                let val2 = values.pop();
    	                let val1 = values.pop();
    	                let op = ops.pop();
    	                values.push(applyOp(val1, val2, op));
    	            }
    	            ops.pop();
    	        }
    	        if(token[i] == '+' || token[i] == '-' || token[i] == '*' || token[i] == '/') {
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
    	    while(ops.length != 0) {
    	        let val2 = values.pop();
    	        let val1 = values.pop();
    	        let op = ops.pop();
    	        values.push(applyOp(val1, val2, op));
    	    }
    	    return values[values.length - 1];
    }
    else{
    	return result;
    }

   
}