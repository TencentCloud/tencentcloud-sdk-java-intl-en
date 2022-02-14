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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteApplicationRequest extends AbstractModel{

    /**
    * Service ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Retain as default
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Whether to delete this application automatically when there is no running version.
    */
    @SerializedName("DeleteApplicationIfNoRunningVersion")
    @Expose
    private Boolean DeleteApplicationIfNoRunningVersion;

    /**
     * Get Service ID 
     * @return ApplicationId Service ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Service ID
     * @param ApplicationId Service ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Retain as default 
     * @return SourceChannel Retain as default
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Retain as default
     * @param SourceChannel Retain as default
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get Whether to delete this application automatically when there is no running version. 
     * @return DeleteApplicationIfNoRunningVersion Whether to delete this application automatically when there is no running version.
     */
    public Boolean getDeleteApplicationIfNoRunningVersion() {
        return this.DeleteApplicationIfNoRunningVersion;
    }

    /**
     * Set Whether to delete this application automatically when there is no running version.
     * @param DeleteApplicationIfNoRunningVersion Whether to delete this application automatically when there is no running version.
     */
    public void setDeleteApplicationIfNoRunningVersion(Boolean DeleteApplicationIfNoRunningVersion) {
        this.DeleteApplicationIfNoRunningVersion = DeleteApplicationIfNoRunningVersion;
    }

    public DeleteApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteApplicationRequest(DeleteApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.DeleteApplicationIfNoRunningVersion != null) {
            this.DeleteApplicationIfNoRunningVersion = new Boolean(source.DeleteApplicationIfNoRunningVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "DeleteApplicationIfNoRunningVersion", this.DeleteApplicationIfNoRunningVersion);

    }
}

