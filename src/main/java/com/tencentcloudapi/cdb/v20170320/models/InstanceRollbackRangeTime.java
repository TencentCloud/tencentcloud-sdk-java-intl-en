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

public class InstanceRollbackRangeTime extends AbstractModel{

    /**
    * Queries database error code
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Queries database error message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * List of instance IDs. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Time range available for rollback
    */
    @SerializedName("Times")
    @Expose
    private RollbackTimeRange [] Times;

    /**
     * Get Queries database error code 
     * @return Code Queries database error code
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Queries database error code
     * @param Code Queries database error code
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Queries database error message 
     * @return Message Queries database error message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Queries database error message
     * @param Message Queries database error message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get List of instance IDs. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId List of instance IDs. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set List of instance IDs. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId List of instance IDs. An instance ID is in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Time range available for rollback 
     * @return Times Time range available for rollback
     */
    public RollbackTimeRange [] getTimes() {
        return this.Times;
    }

    /**
     * Set Time range available for rollback
     * @param Times Time range available for rollback
     */
    public void setTimes(RollbackTimeRange [] Times) {
        this.Times = Times;
    }

    public InstanceRollbackRangeTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceRollbackRangeTime(InstanceRollbackRangeTime source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Times != null) {
            this.Times = new RollbackTimeRange[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new RollbackTimeRange(source.Times[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);

    }
}

