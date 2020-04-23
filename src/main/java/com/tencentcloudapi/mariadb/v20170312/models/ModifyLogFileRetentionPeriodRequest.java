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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLogFileRetentionPeriodRequest extends AbstractModel{

    /**
    * Instance ID in the format of `tdsql-ow728lmc`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Retention days up to 30
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
     * Get Instance ID in the format of `tdsql-ow728lmc`. 
     * @return InstanceId Instance ID in the format of `tdsql-ow728lmc`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `tdsql-ow728lmc`.
     * @param InstanceId Instance ID in the format of `tdsql-ow728lmc`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Retention days up to 30 
     * @return Days Retention days up to 30
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set Retention days up to 30
     * @param Days Retention days up to 30
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Days", this.Days);

    }
}

