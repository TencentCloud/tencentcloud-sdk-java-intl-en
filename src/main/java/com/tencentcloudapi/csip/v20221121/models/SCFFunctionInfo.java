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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SCFFunctionInfo extends AbstractModel {

    /**
    * Function ID
Parameter format: such as lam-xxxxxxxx
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function status
Enumeration value:
Active: available
Creating
Updating
CreateFailed: creation failed
Deleting: deleting.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Function type
Enumeration value:
Event: Event function (the current API only returns this type)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Function ID
Parameter format: such as lam-xxxxxxxx 
     * @return FunctionId Function ID
Parameter format: such as lam-xxxxxxxx
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID
Parameter format: such as lam-xxxxxxxx
     * @param FunctionId Function ID
Parameter format: such as lam-xxxxxxxx
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function status
Enumeration value:
Active: available
Creating
Updating
CreateFailed: creation failed
Deleting: deleting. 
     * @return Status Function status
Enumeration value:
Active: available
Creating
Updating
CreateFailed: creation failed
Deleting: deleting.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Function status
Enumeration value:
Active: available
Creating
Updating
CreateFailed: creation failed
Deleting: deleting.
     * @param Status Function status
Enumeration value:
Active: available
Creating
Updating
CreateFailed: creation failed
Deleting: deleting.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Function type
Enumeration value:
Event: Event function (the current API only returns this type) 
     * @return Type Function type
Enumeration value:
Event: Event function (the current API only returns this type)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Function type
Enumeration value:
Event: Event function (the current API only returns this type)
     * @param Type Function type
Enumeration value:
Event: Event function (the current API only returns this type)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SCFFunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCFFunctionInfo(SCFFunctionInfo source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

