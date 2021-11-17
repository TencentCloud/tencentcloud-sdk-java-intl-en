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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParametersRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Name of the parameter to be queried. If `ParamName` is left empty or not passed in, the list of all parameters will be returned.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Name of the parameter to be queried. If `ParamName` is left empty or not passed in, the list of all parameters will be returned. 
     * @return ParamName Name of the parameter to be queried. If `ParamName` is left empty or not passed in, the list of all parameters will be returned.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Name of the parameter to be queried. If `ParamName` is left empty or not passed in, the list of all parameters will be returned.
     * @param ParamName Name of the parameter to be queried. If `ParamName` is left empty or not passed in, the list of all parameters will be returned.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    public DescribeDBInstanceParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParametersRequest(DescribeDBInstanceParametersRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);

    }
}

