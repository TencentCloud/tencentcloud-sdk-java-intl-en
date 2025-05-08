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

public class DescribeRabbitMQServerlessUserRequest extends AbstractModel {

    /**
    * instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Retrieves usernames. supports prefix match and suffix matching.
    */
    @SerializedName("SearchUser")
    @Expose
    private String SearchUser;

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
    * Specifies the username for an exact query.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * User tag. filters by Tag filter list.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get instance ID 
     * @return InstanceId instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID
     * @param InstanceId instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Retrieves usernames. supports prefix match and suffix matching. 
     * @return SearchUser Retrieves usernames. supports prefix match and suffix matching.
     */
    public String getSearchUser() {
        return this.SearchUser;
    }

    /**
     * Set Retrieves usernames. supports prefix match and suffix matching.
     * @param SearchUser Retrieves usernames. supports prefix match and suffix matching.
     */
    public void setSearchUser(String SearchUser) {
        this.SearchUser = SearchUser;
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

    /**
     * Get Specifies the username for an exact query. 
     * @return User Specifies the username for an exact query.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Specifies the username for an exact query.
     * @param User Specifies the username for an exact query.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get User tag. filters by Tag filter list. 
     * @return Tags User tag. filters by Tag filter list.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set User tag. filters by Tag filter list.
     * @param Tags User tag. filters by Tag filter list.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRabbitMQServerlessUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessUserRequest(DescribeRabbitMQServerlessUserRequest source) {
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

