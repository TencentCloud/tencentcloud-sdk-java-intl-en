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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetToModify extends AbstractModel {

    /**
    * Backend service IP. At least one of **TargetIp** and **TargetId** is required.

- When the server group is of the **Instance** type, this parameter is the primary or secondary private IP of **Eni**.

    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * Port used by the real server. Value range: **1-65535**.

>When the **targetType** value of the target group is **Instance**, this parameter is required.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Weight of the backend service. Value range: **0-100**. If the weight is set to **0**, the request will not be forwarded to this backend service.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Backend service IP. At least one of **TargetIp** and **TargetId** is required.

- When the server group is of the **Instance** type, this parameter is the primary or secondary private IP of **Eni**.
 
     * @return TargetIp Backend service IP. At least one of **TargetIp** and **TargetId** is required.

- When the server group is of the **Instance** type, this parameter is the primary or secondary private IP of **Eni**.

     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set Backend service IP. At least one of **TargetIp** and **TargetId** is required.

- When the server group is of the **Instance** type, this parameter is the primary or secondary private IP of **Eni**.

     * @param TargetIp Backend service IP. At least one of **TargetIp** and **TargetId** is required.

- When the server group is of the **Instance** type, this parameter is the primary or secondary private IP of **Eni**.

     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get Port used by the real server. Value range: **1-65535**.

>When the **targetType** value of the target group is **Instance**, this parameter is required. 
     * @return Port Port used by the real server. Value range: **1-65535**.

>When the **targetType** value of the target group is **Instance**, this parameter is required.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port used by the real server. Value range: **1-65535**.

>When the **targetType** value of the target group is **Instance**, this parameter is required.
     * @param Port Port used by the real server. Value range: **1-65535**.

>When the **targetType** value of the target group is **Instance**, this parameter is required.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Weight of the backend service. Value range: **0-100**. If the weight is set to **0**, the request will not be forwarded to this backend service. 
     * @return Weight Weight of the backend service. Value range: **0-100**. If the weight is set to **0**, the request will not be forwarded to this backend service.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of the backend service. Value range: **0-100**. If the weight is set to **0**, the request will not be forwarded to this backend service.
     * @param Weight Weight of the backend service. Value range: **0-100**. If the weight is set to **0**, the request will not be forwarded to this backend service.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetToModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetToModify(TargetToModify source) {
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

