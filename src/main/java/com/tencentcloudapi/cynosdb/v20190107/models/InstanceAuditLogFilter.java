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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAuditLogFilter extends AbstractModel {

    /**
    * Filter item. Currently supports the following search criteria:

Includes, excludes, includes (segment dimension), excludes (segment dimension): sql - SQL detail; alarmLevel - alarm level; ruleTemplateId - rule template id

Equal to, not equal to, contains, does not contain: host - client IP address; user - userName; dbName - database name;

Equal, not equal to: sqlType - SQL type; errCode - error code; threadId - thread ID.

Range search (time type is unified to µs): execTime - execution time; lockWaitTime - execution time; ioWaitTime - IO wait time; trxLivingTime - transaction duration; cpuTime - CPU time; checkRows - scanned rows; affectRows - number of affected rows; sentRows - rows returned.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter criteria. The following conditions are supported:
WINC-Contains (segment dimension)
WEXC - Excluding (segment dimension)
INC - included
EXC - Excluding
EQS - equal to
NEQ - not equal to
RA - Range.
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
    * Filtered value. In reverse query, multiple values have an AND relationship. In forward query, multiple values have an OR relationship.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Filter item. Currently supports the following search criteria:

Includes, excludes, includes (segment dimension), excludes (segment dimension): sql - SQL detail; alarmLevel - alarm level; ruleTemplateId - rule template id

Equal to, not equal to, contains, does not contain: host - client IP address; user - userName; dbName - database name;

Equal, not equal to: sqlType - SQL type; errCode - error code; threadId - thread ID.

Range search (time type is unified to µs): execTime - execution time; lockWaitTime - execution time; ioWaitTime - IO wait time; trxLivingTime - transaction duration; cpuTime - CPU time; checkRows - scanned rows; affectRows - number of affected rows; sentRows - rows returned. 
     * @return Type Filter item. Currently supports the following search criteria:

Includes, excludes, includes (segment dimension), excludes (segment dimension): sql - SQL detail; alarmLevel - alarm level; ruleTemplateId - rule template id

Equal to, not equal to, contains, does not contain: host - client IP address; user - userName; dbName - database name;

Equal, not equal to: sqlType - SQL type; errCode - error code; threadId - thread ID.

Range search (time type is unified to µs): execTime - execution time; lockWaitTime - execution time; ioWaitTime - IO wait time; trxLivingTime - transaction duration; cpuTime - CPU time; checkRows - scanned rows; affectRows - number of affected rows; sentRows - rows returned.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Filter item. Currently supports the following search criteria:

Includes, excludes, includes (segment dimension), excludes (segment dimension): sql - SQL detail; alarmLevel - alarm level; ruleTemplateId - rule template id

Equal to, not equal to, contains, does not contain: host - client IP address; user - userName; dbName - database name;

Equal, not equal to: sqlType - SQL type; errCode - error code; threadId - thread ID.

Range search (time type is unified to µs): execTime - execution time; lockWaitTime - execution time; ioWaitTime - IO wait time; trxLivingTime - transaction duration; cpuTime - CPU time; checkRows - scanned rows; affectRows - number of affected rows; sentRows - rows returned.
     * @param Type Filter item. Currently supports the following search criteria:

Includes, excludes, includes (segment dimension), excludes (segment dimension): sql - SQL detail; alarmLevel - alarm level; ruleTemplateId - rule template id

Equal to, not equal to, contains, does not contain: host - client IP address; user - userName; dbName - database name;

Equal, not equal to: sqlType - SQL type; errCode - error code; threadId - thread ID.

Range search (time type is unified to µs): execTime - execution time; lockWaitTime - execution time; ioWaitTime - IO wait time; trxLivingTime - transaction duration; cpuTime - CPU time; checkRows - scanned rows; affectRows - number of affected rows; sentRows - rows returned.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter criteria. The following conditions are supported:
WINC-Contains (segment dimension)
WEXC - Excluding (segment dimension)
INC - included
EXC - Excluding
EQS - equal to
NEQ - not equal to
RA - Range. 
     * @return Compare Filter criteria. The following conditions are supported:
WINC-Contains (segment dimension)
WEXC - Excluding (segment dimension)
INC - included
EXC - Excluding
EQS - equal to
NEQ - not equal to
RA - Range.
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Filter criteria. The following conditions are supported:
WINC-Contains (segment dimension)
WEXC - Excluding (segment dimension)
INC - included
EXC - Excluding
EQS - equal to
NEQ - not equal to
RA - Range.
     * @param Compare Filter criteria. The following conditions are supported:
WINC-Contains (segment dimension)
WEXC - Excluding (segment dimension)
INC - included
EXC - Excluding
EQS - equal to
NEQ - not equal to
RA - Range.
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    /**
     * Get Filtered value. In reverse query, multiple values have an AND relationship. In forward query, multiple values have an OR relationship. 
     * @return Value Filtered value. In reverse query, multiple values have an AND relationship. In forward query, multiple values have an OR relationship.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Filtered value. In reverse query, multiple values have an AND relationship. In forward query, multiple values have an OR relationship.
     * @param Value Filtered value. In reverse query, multiple values have an AND relationship. In forward query, multiple values have an OR relationship.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public InstanceAuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceAuditLogFilter(InstanceAuditLogFilter source) {
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

