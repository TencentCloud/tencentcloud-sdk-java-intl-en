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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaveWorkflowDebugContextRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Application variable list.</p>
    */
    @SerializedName("AppVariableValueList")
    @Expose
    private AppVariableValue [] AppVariableValueList;

    /**
    * <p>Session ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Custom user ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Application variable list.</p> 
     * @return AppVariableValueList <p>Application variable list.</p>
     */
    public AppVariableValue [] getAppVariableValueList() {
        return this.AppVariableValueList;
    }

    /**
     * Set <p>Application variable list.</p>
     * @param AppVariableValueList <p>Application variable list.</p>
     */
    public void setAppVariableValueList(AppVariableValue [] AppVariableValueList) {
        this.AppVariableValueList = AppVariableValueList;
    }

    /**
     * Get <p>Session ID</p> 
     * @return SessionId <p>Session ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID</p>
     * @param SessionId <p>Session ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Custom user ID</p> 
     * @return UserId <p>Custom user ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Custom user ID</p>
     * @param UserId <p>Custom user ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public SaveWorkflowDebugContextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveWorkflowDebugContextRequest(SaveWorkflowDebugContextRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppVariableValueList != null) {
            this.AppVariableValueList = new AppVariableValue[source.AppVariableValueList.length];
            for (int i = 0; i < source.AppVariableValueList.length; i++) {
                this.AppVariableValueList[i] = new AppVariableValue(source.AppVariableValueList[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "AppVariableValueList.", this.AppVariableValueList);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

