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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenAuditServiceRequest extends AbstractModel {

    /**
    * Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Use the value of `u200cProduct` for this parameter, such as `dcdb` and `mariadb`.
    */
    @SerializedName("NodeRequestType")
    @Expose
    private String NodeRequestType;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Total log retention period in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * Storage period of frequently accessed logs in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
     * Get Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB). 
     * @return Product Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
     * @param Product Service type. Valid values: `dcdb` (TDSQL for MySQL), `mariadb` (TencentDB for MariaDB).
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Use the value of `u200cProduct` for this parameter, such as `dcdb` and `mariadb`. 
     * @return NodeRequestType Use the value of `u200cProduct` for this parameter, such as `dcdb` and `mariadb`.
     */
    public String getNodeRequestType() {
        return this.NodeRequestType;
    }

    /**
     * Set Use the value of `u200cProduct` for this parameter, such as `dcdb` and `mariadb`.
     * @param NodeRequestType Use the value of `u200cProduct` for this parameter, such as `dcdb` and `mariadb`.
     */
    public void setNodeRequestType(String NodeRequestType) {
        this.NodeRequestType = NodeRequestType;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Total log retention period in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`. 
     * @return LogExpireDay Total log retention period in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set Total log retention period in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
     * @param LogExpireDay Total log retention period in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get Storage period of frequently accessed logs in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`. 
     * @return HotLogExpireDay Storage period of frequently accessed logs in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set Storage period of frequently accessed logs in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
     * @param HotLogExpireDay Storage period of frequently accessed logs in days. Valid values: `7`, `30`, `90`, `180`, `365`, `1095`, `1825`.
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    public OpenAuditServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenAuditServiceRequest(OpenAuditServiceRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.NodeRequestType != null) {
            this.NodeRequestType = new String(source.NodeRequestType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "NodeRequestType", this.NodeRequestType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);

    }
}

