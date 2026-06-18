/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogFilter extends AbstractModel {

    /**
    * Filter criterion name.

For example: sql - SQL command details

host - client IP
user - database account;
dbName – Database name;
sqlType - SQL type;
Error code

execTime - Execution time
lockWaitTime - Lock waiting time
ioWaitTime - IO wait time
trxLivingTime - Transaction execution time
Cpu time

threadId - Thread ID
trxId - Transaction ID
checkRows - Number of scanned rows
affectRows - Number of rows affected
sentRows - Number of rows returned
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter condition match type. Supported:
INC – Includes (multiple values are in a || relationship before).
EXC - excluding (multiple values are in an && relationship)
EQS – equal to (multiple values before are in a || relationship).
NEQ – not equal to (multiple values are in && relationship)

RG - Range;
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * Filter condition matching value. When Compare=RG, for example ["1-100","200-300"].
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Filter criterion name.

For example: sql - SQL command details

host - client IP
user - database account;
dbName – Database name;
sqlType - SQL type;
Error code

execTime - Execution time
lockWaitTime - Lock waiting time
ioWaitTime - IO wait time
trxLivingTime - Transaction execution time
Cpu time

threadId - Thread ID
trxId - Transaction ID
checkRows - Number of scanned rows
affectRows - Number of rows affected
sentRows - Number of rows returned 
     * @return Type Filter criterion name.

For example: sql - SQL command details

host - client IP
user - database account;
dbName – Database name;
sqlType - SQL type;
Error code

execTime - Execution time
lockWaitTime - Lock waiting time
ioWaitTime - IO wait time
trxLivingTime - Transaction execution time
Cpu time

threadId - Thread ID
trxId - Transaction ID
checkRows - Number of scanned rows
affectRows - Number of rows affected
sentRows - Number of rows returned
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Filter criterion name.

For example: sql - SQL command details

host - client IP
user - database account;
dbName – Database name;
sqlType - SQL type;
Error code

execTime - Execution time
lockWaitTime - Lock waiting time
ioWaitTime - IO wait time
trxLivingTime - Transaction execution time
Cpu time

threadId - Thread ID
trxId - Transaction ID
checkRows - Number of scanned rows
affectRows - Number of rows affected
sentRows - Number of rows returned
     * @param Type Filter criterion name.

For example: sql - SQL command details

host - client IP
user - database account;
dbName – Database name;
sqlType - SQL type;
Error code

execTime - Execution time
lockWaitTime - Lock waiting time
ioWaitTime - IO wait time
trxLivingTime - Transaction execution time
Cpu time

threadId - Thread ID
trxId - Transaction ID
checkRows - Number of scanned rows
affectRows - Number of rows affected
sentRows - Number of rows returned
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter condition match type. Supported:
INC – Includes (multiple values are in a || relationship before).
EXC - excluding (multiple values are in an && relationship)
EQS – equal to (multiple values before are in a || relationship).
NEQ – not equal to (multiple values are in && relationship)

RG - Range; 
     * @return Compare Filter condition match type. Supported:
INC – Includes (multiple values are in a || relationship before).
EXC - excluding (multiple values are in an && relationship)
EQS – equal to (multiple values before are in a || relationship).
NEQ – not equal to (multiple values are in && relationship)

RG - Range;
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Filter condition match type. Supported:
INC – Includes (multiple values are in a || relationship before).
EXC - excluding (multiple values are in an && relationship)
EQS – equal to (multiple values before are in a || relationship).
NEQ – not equal to (multiple values are in && relationship)

RG - Range;
     * @param Compare Filter condition match type. Supported:
INC – Includes (multiple values are in a || relationship before).
EXC - excluding (multiple values are in an && relationship)
EQS – equal to (multiple values before are in a || relationship).
NEQ – not equal to (multiple values are in && relationship)

RG - Range;
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get Filter condition matching value. When Compare=RG, for example ["1-100","200-300"]. 
     * @return Value Filter condition matching value. When Compare=RG, for example ["1-100","200-300"].
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Filter condition matching value. When Compare=RG, for example ["1-100","200-300"].
     * @param Value Filter condition matching value. When Compare=RG, for example ["1-100","200-300"].
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public LogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogFilter(LogFilter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Compare", this.Compare);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

