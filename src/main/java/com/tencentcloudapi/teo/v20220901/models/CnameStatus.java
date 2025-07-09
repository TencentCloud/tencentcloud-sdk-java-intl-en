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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CnameStatus extends AbstractModel {

    /**
    * The domain name.
    */
    @SerializedName("RecordName")
    @Expose
    private String RecordName;

    /**
    * The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * The CNAME status. Values:
<li>`active`: Activated</li>
<li>`moved`: Not activated </li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get The domain name. 
     * @return RecordName The domain name.
     */
    public String getRecordName() {
        return this.RecordName;
    }

    /**
     * Set The domain name.
     * @param RecordName The domain name.
     */
    public void setRecordName(String RecordName) {
        this.RecordName = RecordName;
    }

    /**
     * Get The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cname The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cname The CNAME address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get The CNAME status. Values:
<li>`active`: Activated</li>
<li>`moved`: Not activated </li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The CNAME status. Values:
<li>`active`: Activated</li>
<li>`moved`: Not activated </li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The CNAME status. Values:
<li>`active`: Activated</li>
<li>`moved`: Not activated </li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The CNAME status. Values:
<li>`active`: Activated</li>
<li>`moved`: Not activated </li>
Note: This field may return null, indicating that no valid values can be obtained.
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
        if (source.RecordName != null) {
            this.RecordName = new String(source.RecordName);
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
        this.setParamSimple(map, prefix + "RecordName", this.RecordName);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

