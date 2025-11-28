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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQUserRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username search by prefix or suffix
    */
    @SerializedName("SearchUser")
    @Expose
    private String SearchUser;

    /**
    * Specifies the page Offset. default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page Limit. default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Username, which is queried by exact match.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * User tag, used to determine the access permission of the user for RabbitMQ Management.
management: ordinary console user. monitoring: administrative console user. other value: non-console user.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username search by prefix or suffix 
     * @return SearchUser Username search by prefix or suffix
     */
    public String getSearchUser() {
        return this.SearchUser;
    }

    /**
     * Set Username search by prefix or suffix
     * @param SearchUser Username search by prefix or suffix
     */
    public void setSearchUser(String SearchUser) {
        this.SearchUser = SearchUser;
    }

    /**
     * Get Specifies the page Offset. default is 0. 
     * @return Offset Specifies the page Offset. default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the page Offset. default is 0.
     * @param Offset Specifies the page Offset. default is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page Limit. default value: 20. 
     * @return Limit Page Limit. default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page Limit. default value: 20.
     * @param Limit Page Limit. default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Username, which is queried by exact match. 
     * @return User Username, which is queried by exact match.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username, which is queried by exact match.
     * @param User Username, which is queried by exact match.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get User tag, used to determine the access permission of the user for RabbitMQ Management.
management: ordinary console user. monitoring: administrative console user. other value: non-console user. 
     * @return Tags User tag, used to determine the access permission of the user for RabbitMQ Management.
management: ordinary console user. monitoring: administrative console user. other value: non-console user.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set User tag, used to determine the access permission of the user for RabbitMQ Management.
management: ordinary console user. monitoring: administrative console user. other value: non-console user.
     * @param Tags User tag, used to determine the access permission of the user for RabbitMQ Management.
management: ordinary console user. monitoring: administrative console user. other value: non-console user.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRabbitMQUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQUserRequest(DescribeRabbitMQUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchUser != null) {
            this.SearchUser = new String(source.SearchUser);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchUser", this.SearchUser);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

