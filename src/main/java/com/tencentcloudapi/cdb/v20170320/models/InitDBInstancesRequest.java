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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDBInstancesRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * New password of the instance. Rule: It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (!@#$%^*()).
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
    * List of instance parameters. Currently, "character_set_server" and "lower_case_table_names" are supported, whose value ranges are ["utf8","latin1","gbk","utf8mb4"] and ["0","1"], respectively.
    */
    @SerializedName("Parameters")
    @Expose
    private ParamInfo [] Parameters;

    /**
    * Instance port. Value range: [1024, 65535].
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters. 
     * @return InstanceIds Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
     * @param InstanceIds Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [instance list querying API](https://cloud.tencent.com/document/api/236/15872) to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get New password of the instance. Rule: It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (!@#$%^*()). 
     * @return NewPassword New password of the instance. Rule: It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (!@#$%^*()).
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * Set New password of the instance. Rule: It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (!@#$%^*()).
     * @param NewPassword New password of the instance. Rule: It can only contain 8-64 characters and must contain at least two of the following types of characters: letters, digits, and special characters (!@#$%^*()).
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * Get List of instance parameters. Currently, "character_set_server" and "lower_case_table_names" are supported, whose value ranges are ["utf8","latin1","gbk","utf8mb4"] and ["0","1"], respectively. 
     * @return Parameters List of instance parameters. Currently, "character_set_server" and "lower_case_table_names" are supported, whose value ranges are ["utf8","latin1","gbk","utf8mb4"] and ["0","1"], respectively.
     */
    public ParamInfo [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set List of instance parameters. Currently, "character_set_server" and "lower_case_table_names" are supported, whose value ranges are ["utf8","latin1","gbk","utf8mb4"] and ["0","1"], respectively.
     * @param Parameters List of instance parameters. Currently, "character_set_server" and "lower_case_table_names" are supported, whose value ranges are ["utf8","latin1","gbk","utf8mb4"] and ["0","1"], respectively.
     */
    public void setParameters(ParamInfo [] Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Instance port. Value range: [1024, 65535]. 
     * @return Vport Instance port. Value range: [1024, 65535].
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Instance port. Value range: [1024, 65535].
     * @param Vport Instance port. Value range: [1024, 65535].
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

