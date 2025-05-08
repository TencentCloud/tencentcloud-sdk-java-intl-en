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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessPermissionRequest extends AbstractModel {

    /**
    * instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the username for query filtering. if not provided, all will be queried.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Specifies the vhost name. used for query filtering. if it is not provided, query all.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get instance ID. 
     * @return InstanceId instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID.
     * @param InstanceId instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the username for query filtering. if not provided, all will be queried. 
     * @return User Specifies the username for query filtering. if not provided, all will be queried.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Specifies the username for query filtering. if not provided, all will be queried.
     * @param User Specifies the username for query filtering. if not provided, all will be queried.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Specifies the vhost name. used for query filtering. if it is not provided, query all. 
     * @return VirtualHost Specifies the vhost name. used for query filtering. if it is not provided, query all.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Specifies the vhost name. used for query filtering. if it is not provided, query all.
     * @param VirtualHost Specifies the vhost name. used for query filtering. if it is not provided, query all.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRabbitMQServerlessPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessPermissionRequest(DescribeRabbitMQServerlessPermissionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

