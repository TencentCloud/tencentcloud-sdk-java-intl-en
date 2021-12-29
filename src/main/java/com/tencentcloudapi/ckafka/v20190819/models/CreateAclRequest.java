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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAclRequest extends AbstractModel{

    /**
    * Instance ID information
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
    * ACL operation type (`2`: ALL, `3`: READ, `4`: WRITE, `5`: CREATE, `6`: DELETE, `7`: ALTER, `8`: DESCRIBE, `9`: CLUSTER_ACTION, `10`: DESCRIBE_CONFIGS, `11`: ALTER_CONFIGS, `12`: IDEMPOTENT_WRITE).
    */
    @SerializedName("Operation")
    @Expose
    private Long Operation;

    /**
    * Permission type (`2`: DENY, `3`: ALLOW). CKafka currently supports `ALLOW`, which is equivalent to allowlist. `DENY` will be supported for ACLs compatible with open-source Kafka.
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
    * Resource name, which is related to `resourceType`. For example, if `resourceType` is `TOPIC`, this field indicates the topic name; if `resourceType` is `GROUP`, this field indicates the group name; if `resourceType` is `CLUSTER`, this field can be left empty.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * The default value is `*`, which means that any host can access. Currently, CKafka does not support the host as `*`, but the future product based on the open-source Kafka will directly support this
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The list of users allowed to access the topic. Default: User:*, meaning all users. The current user must be in the user list. Add `User:` before the user name (`User:A` for example).
    */
    @SerializedName("Principal")
    @Expose
    private String Principal;

    /**
    * The resource name list, which is in JSON string format. Either `ResourceName` or `resourceNameList` can be specified.
    */
    @SerializedName("ResourceNameList")
    @Expose
    private String ResourceNameList;

    /**
     * Get Instance ID information 
     * @return InstanceId Instance ID information
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID information
     * @param InstanceId Instance ID information
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
     * Get Permission type (`2`: DENY, `3`: ALLOW). CKafka currently supports `ALLOW`, which is equivalent to allowlist. `DENY` will be supported for ACLs compatible with open-source Kafka. 
     * @return PermissionType Permission type (`2`: DENY, `3`: ALLOW). CKafka currently supports `ALLOW`, which is equivalent to allowlist. `DENY` will be supported for ACLs compatible with open-source Kafka.
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set Permission type (`2`: DENY, `3`: ALLOW). CKafka currently supports `ALLOW`, which is equivalent to allowlist. `DENY` will be supported for ACLs compatible with open-source Kafka.
     * @param PermissionType Permission type (`2`: DENY, `3`: ALLOW). CKafka currently supports `ALLOW`, which is equivalent to allowlist. `DENY` will be supported for ACLs compatible with open-source Kafka.
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
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
     * Get The list of users allowed to access the topic. Default: User:*, meaning all users. The current user must be in the user list. Add `User:` before the user name (`User:A` for example). 
     * @return Principal The list of users allowed to access the topic. Default: User:*, meaning all users. The current user must be in the user list. Add `User:` before the user name (`User:A` for example).
     */
    public String getPrincipal() {
        return this.Principal;
    }

    /**
     * Set The list of users allowed to access the topic. Default: User:*, meaning all users. The current user must be in the user list. Add `User:` before the user name (`User:A` for example).
     * @param Principal The list of users allowed to access the topic. Default: User:*, meaning all users. The current user must be in the user list. Add `User:` before the user name (`User:A` for example).
     */
    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    /**
     * Get The resource name list, which is in JSON string format. Either `ResourceName` or `resourceNameList` can be specified. 
     * @return ResourceNameList The resource name list, which is in JSON string format. Either `ResourceName` or `resourceNameList` can be specified.
     */
    public String getResourceNameList() {
        return this.ResourceNameList;
    }

    /**
     * Set The resource name list, which is in JSON string format. Either `ResourceName` or `resourceNameList` can be specified.
     * @param ResourceNameList The resource name list, which is in JSON string format. Either `ResourceName` or `resourceNameList` can be specified.
     */
    public void setResourceNameList(String ResourceNameList) {
        this.ResourceNameList = ResourceNameList;
    }

    public CreateAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAclRequest(CreateAclRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Operation != null) {
            this.Operation = new Long(source.Operation);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new Long(source.PermissionType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Principal != null) {
            this.Principal = new String(source.Principal);
        }
        if (source.ResourceNameList != null) {
            this.ResourceNameList = new String(source.ResourceNameList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Principal", this.Principal);
        this.setParamSimple(map, prefix + "ResourceNameList", this.ResourceNameList);

    }
}

