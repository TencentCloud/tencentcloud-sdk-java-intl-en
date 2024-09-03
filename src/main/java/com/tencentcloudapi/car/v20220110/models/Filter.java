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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * Filter field name (ApplicationId: application ID; ApplicationName: application name; ApplicationRunStatus: running status; ApplicationUpdateStatus: update status).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter value set (When the filter name is ApplicationRunStatus, the values can be [ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured]. When the filter name is ApplicationUpdateStatus, the values can be [ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none]).
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Filter field name (ApplicationId: application ID; ApplicationName: application name; ApplicationRunStatus: running status; ApplicationUpdateStatus: update status). 
     * @return Name Filter field name (ApplicationId: application ID; ApplicationName: application name; ApplicationRunStatus: running status; ApplicationUpdateStatus: update status).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name (ApplicationId: application ID; ApplicationName: application name; ApplicationRunStatus: running status; ApplicationUpdateStatus: update status).
     * @param Name Filter field name (ApplicationId: application ID; ApplicationName: application name; ApplicationRunStatus: running status; ApplicationUpdateStatus: update status).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter value set (When the filter name is ApplicationRunStatus, the values can be [ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured]. When the filter name is ApplicationUpdateStatus, the values can be [ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none]). 
     * @return Values Filter value set (When the filter name is ApplicationRunStatus, the values can be [ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured]. When the filter name is ApplicationUpdateStatus, the values can be [ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none]).
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value set (When the filter name is ApplicationRunStatus, the values can be [ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured]. When the filter name is ApplicationUpdateStatus, the values can be [ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none]).
     * @param Values Filter value set (When the filter name is ApplicationRunStatus, the values can be [ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured]. When the filter name is ApplicationUpdateStatus, the values can be [ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none]).
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

