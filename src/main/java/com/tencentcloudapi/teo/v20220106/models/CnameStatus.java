/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CnameStatus extends AbstractModel{

    /**
    * Record name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * Status
`active`: Activated
`moved`: Not activated
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Record name 
     * @return Name Record name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Record name
     * @param Name Record name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Cname CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Cname CNAME address
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get Status
`active`: Activated
`moved`: Not activated
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Status Status
`active`: Activated
`moved`: Not activated
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
`active`: Activated
`moved`: Not activated
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Status Status
`active`: Activated
`moved`: Not activated
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CnameStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CnameStatus(CnameStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

