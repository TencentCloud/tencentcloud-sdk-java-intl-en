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

public class TargetOutput extends AbstractModel {

    /**
    * Network-interface ID.
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
    * Port used by the real server. Value range: **1-65535**.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Backend service IP. At least one of **TargetIp** and **TargetId** is required.

- When the server group is of the **Instance** type, this parameter is the primary or secondary private IP of **Eni**.

    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * Backend service name. Currently, only CVM backend services return a valid name.
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * Backend service status. Valid values:
- **Adding**: Adding.
- **Active**: available status.
- **Configuring**: configuration in progress.
- **Removing**: removing.
    */
    @SerializedName("TargetStatus")
    @Expose
    private String TargetStatus;

    /**
    * Backend service type.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Weight of the backend service. Value range: **0-100**. Default value: **100**. If the weight is set to **0**, no request will be forwarded to this backend service.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Network-interface ID. 
     * @return EniId Network-interface ID.
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set Network-interface ID.
     * @param EniId Network-interface ID.
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Get Port used by the real server. Value range: **1-65535**. 
     * @return Port Port used by the real server. Value range: **1-65535**.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port used by the real server. Value range: **1-65535**.
     * @param Port Port used by the real server. Value range: **1-65535**.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters. 
     * @return TargetId Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     * @param TargetId Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

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
     * Get Backend service name. Currently, only CVM backend services return a valid name. 
     * @return TargetName Backend service name. Currently, only CVM backend services return a valid name.
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Backend service name. Currently, only CVM backend services return a valid name.
     * @param TargetName Backend service name. Currently, only CVM backend services return a valid name.
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get Backend service status. Valid values:
- **Adding**: Adding.
- **Active**: available status.
- **Configuring**: configuration in progress.
- **Removing**: removing. 
     * @return TargetStatus Backend service status. Valid values:
- **Adding**: Adding.
- **Active**: available status.
- **Configuring**: configuration in progress.
- **Removing**: removing.
     */
    public String getTargetStatus() {
        return this.TargetStatus;
    }

    /**
     * Set Backend service status. Valid values:
- **Adding**: Adding.
- **Active**: available status.
- **Configuring**: configuration in progress.
- **Removing**: removing.
     * @param TargetStatus Backend service status. Valid values:
- **Adding**: Adding.
- **Active**: available status.
- **Configuring**: configuration in progress.
- **Removing**: removing.
     */
    public void setTargetStatus(String TargetStatus) {
        this.TargetStatus = TargetStatus;
    }

    /**
     * Get Backend service type. 
     * @return TargetType Backend service type.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Backend service type.
     * @param TargetType Backend service type.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Weight of the backend service. Value range: **0-100**. Default value: **100**. If the weight is set to **0**, no request will be forwarded to this backend service. 
     * @return Weight Weight of the backend service. Value range: **0-100**. Default value: **100**. If the weight is set to **0**, no request will be forwarded to this backend service.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of the backend service. Value range: **0-100**. Default value: **100**. If the weight is set to **0**, no request will be forwarded to this backend service.
     * @param Weight Weight of the backend service. Value range: **0-100**. Default value: **100**. If the weight is set to **0**, no request will be forwarded to this backend service.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetOutput(TargetOutput source) {
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.TargetStatus != null) {
            this.TargetStatus = new String(source.TargetStatus);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EniId", this.EniId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "TargetStatus", this.TargetStatus);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

