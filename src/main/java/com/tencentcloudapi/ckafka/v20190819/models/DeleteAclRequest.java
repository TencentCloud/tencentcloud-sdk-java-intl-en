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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAclRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * ACL operation type (`2`: ALL, `3`: READ, `4`: WRITE, `5`: CREATE, `6`: DELETE, `7`: ALTER, `8`: DESCRIBE, `9`: CLUSTER_ACTION, `10`: DESCRIBE_CONFIGS, `11`: ALTER_CONFIGS, `12`: IDEMPOTENT_WRITE).
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * Permission type (2:DENY, 3:ALLOW). currently ckafka supports ALLOW (equivalent to allowlist), others used when compatible with open-source kafka acl.
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
    * The default value is `*`, which means that any host can access. Currently, CKafka does not support the host as `*`, but the future product based on the open-source Kafka will directly support this
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * List of users, defaults to User:*, means any User is accessible in the entire region. the current User can only be the User in the list of users.
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
     * Get The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId The ckafka cluster instance Id, which can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER). 
     * @return ResourceType ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
     * @param ResourceType ACL resource type (`2`: TOPIC, `3`: GROUP, `4`: CLUSTER).
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty. 
     * @return ResourceName Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
     * @param ResourceName Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get ACL operation type (`2`: ALL, `3`: READ, `4`: WRITE, `5`: CREATE, `6`: DELETE, `7`: ALTER, `8`: DESCRIBE, `9`: CLUSTER_ACTION, `10`: DESCRIBE_CONFIGS, `11`: ALTER_CONFIGS, `12`: IDEMPOTENT_WRITE). 
     * @return Operation ACL operation type (`2`: ALL, `3`: READ, `4`: WRITE, `5`: CREATE, `6`: DELETE, `7`: ALTER, `8`: DESCRIBE, `9`: CLUSTER_ACTION, `10`: DESCRIBE_CONFIGS, `11`: ALTER_CONFIGS, `12`: IDEMPOTENT_WRITE).
     */
    public Long getOperation() {
        return this.Operation;
    }

    /**
     * Set ACL operation type (`2`: ALL, `3`: READ, `4`: WRITE, `5`: CREATE, `6`: DELETE, `7`: ALTER, `8`: DESCRIBE, `9`: CLUSTER_ACTION, `10`: DESCRIBE_CONFIGS, `11`: ALTER_CONFIGS, `12`: IDEMPOTENT_WRITE).
     * @param Operation ACL operation type (`2`: ALL, `3`: READ, `4`: WRITE, `5`: CREATE, `6`: DELETE, `7`: ALTER, `8`: DESCRIBE, `9`: CLUSTER_ACTION, `10`: DESCRIBE_CONFIGS, `11`: ALTER_CONFIGS, `12`: IDEMPOTENT_WRITE).
     */
    public void setOperation(Long Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Permission type (2:DENY, 3:ALLOW). currently ckafka supports ALLOW (equivalent to allowlist), others used when compatible with open-source kafka acl. 
     * @return PermissionType Permission type (2:DENY, 3:ALLOW). currently ckafka supports ALLOW (equivalent to allowlist), others used when compatible with open-source kafka acl.
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set Permission type (2:DENY, 3:ALLOW). currently ckafka supports ALLOW (equivalent to allowlist), others used when compatible with open-source kafka acl.
     * @param PermissionType Permission type (2:DENY, 3:ALLOW). currently ckafka supports ALLOW (equivalent to allowlist), others used when compatible with open-source kafka acl.
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    /**
     * Get The default value is `*`, which means that any host can access. Currently, CKafka does not support the host as `*`, but the future product based on the open-source Kafka will directly support this 
     * @return Host The default value is `*`, which means that any host can access. Currently, CKafka does not support the host as `*`, but the future product based on the open-source Kafka will directly support this
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The default value is `*`, which means that any host can access. Currently, CKafka does not support the host as `*`, but the future product based on the open-source Kafka will directly support this
     * @param Host The default value is `*`, which means that any host can access. Currently, CKafka does not support the host as `*`, but the future product based on the open-source Kafka will directly support this
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get List of users, defaults to User:*, means any User is accessible in the entire region. the current User can only be the User in the list of users. 
     * @return Principal List of users, defaults to User:*, means any User is accessible in the entire region. the current User can only be the User in the list of users.
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set List of users, defaults to User:*, means any User is accessible in the entire region. the current User can only be the User in the list of users.
     * @param Principal List of users, defaults to User:*, means any User is accessible in the entire region. the current User can only be the User in the list of users.
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public DeleteAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAclRequest(DeleteAclRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Operation != null) {
            this.Operation = new Long(source.Operation);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new Long(source.PermissionType);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Principal != null) {
            this.Principal = new String(source.Principal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Principal", this.Principal);

    }
}

