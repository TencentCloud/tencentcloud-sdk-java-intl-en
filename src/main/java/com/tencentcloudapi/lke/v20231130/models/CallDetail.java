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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallDetail extends AbstractModel {

    /**
    * Associated ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Call time.
    */
    @SerializedName("CallTime")
    @Expose
    private String CallTime;

    /**
    * Total token consumption.
    */
    @SerializedName("TotalTokenUsage")
    @Expose
    private Float TotalTokenUsage;

    /**
    * Token consumption for input.
    */
    @SerializedName("InputTokenUsage")
    @Expose
    private Float InputTokenUsage;

    /**
    * Token consumption for output.
    */
    @SerializedName("OutputTokenUsage")
    @Expose
    private Float OutputTokenUsage;

    /**
    * Number of search service calls.
    */
    @SerializedName("SearchUsage")
    @Expose
    private Long SearchUsage;

    /**
    * Model name.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Call type.
    */
    @SerializedName("CallType")
    @Expose
    private String CallType;

    /**
    * Account.
    */
    @SerializedName("UinAccount")
    @Expose
    private String UinAccount;

    /**
    * Application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Total number of consumed pages.
    */
    @SerializedName("PageUsage")
    @Expose
    private Long PageUsage;

    /**
    * Filter sub-scenario.
    */
    @SerializedName("SubScene")
    @Expose
    private String SubScene;

    /**
     * Get Associated ID. 
     * @return Id Associated ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Associated ID.
     * @param Id Associated ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Call time. 
     * @return CallTime Call time.
     */
    public String getCallTime() {
        return this.CallTime;
    }

    /**
     * Set Call time.
     * @param CallTime Call time.
     */
    public void setCallTime(String CallTime) {
        this.CallTime = CallTime;
    }

    /**
     * Get Total token consumption. 
     * @return TotalTokenUsage Total token consumption.
     */
    public Float getTotalTokenUsage() {
        return this.TotalTokenUsage;
    }

    /**
     * Set Total token consumption.
     * @param TotalTokenUsage Total token consumption.
     */
    public void setTotalTokenUsage(Float TotalTokenUsage) {
        this.TotalTokenUsage = TotalTokenUsage;
    }

    /**
     * Get Token consumption for input. 
     * @return InputTokenUsage Token consumption for input.
     */
    public Float getInputTokenUsage() {
        return this.InputTokenUsage;
    }

    /**
     * Set Token consumption for input.
     * @param InputTokenUsage Token consumption for input.
     */
    public void setInputTokenUsage(Float InputTokenUsage) {
        this.InputTokenUsage = InputTokenUsage;
    }

    /**
     * Get Token consumption for output. 
     * @return OutputTokenUsage Token consumption for output.
     */
    public Float getOutputTokenUsage() {
        return this.OutputTokenUsage;
    }

    /**
     * Set Token consumption for output.
     * @param OutputTokenUsage Token consumption for output.
     */
    public void setOutputTokenUsage(Float OutputTokenUsage) {
        this.OutputTokenUsage = OutputTokenUsage;
    }

    /**
     * Get Number of search service calls. 
     * @return SearchUsage Number of search service calls.
     */
    public Long getSearchUsage() {
        return this.SearchUsage;
    }

    /**
     * Set Number of search service calls.
     * @param SearchUsage Number of search service calls.
     */
    public void setSearchUsage(Long SearchUsage) {
        this.SearchUsage = SearchUsage;
    }

    /**
     * Get Model name. 
     * @return ModelName Model name.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
     * @param ModelName Model name.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Call type. 
     * @return CallType Call type.
     */
    public String getCallType() {
        return this.CallType;
    }

    /**
     * Set Call type.
     * @param CallType Call type.
     */
    public void setCallType(String CallType) {
        this.CallType = CallType;
    }

    /**
     * Get Account. 
     * @return UinAccount Account.
     */
    public String getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set Account.
     * @param UinAccount Account.
     */
    public void setUinAccount(String UinAccount) {
        this.UinAccount = UinAccount;
    }

    /**
     * Get Application name. 
     * @return AppName Application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name.
     * @param AppName Application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Total number of consumed pages. 
     * @return PageUsage Total number of consumed pages.
     */
    public Long getPageUsage() {
        return this.PageUsage;
    }

    /**
     * Set Total number of consumed pages.
     * @param PageUsage Total number of consumed pages.
     */
    public void setPageUsage(Long PageUsage) {
        this.PageUsage = PageUsage;
    }

    /**
     * Get Filter sub-scenario. 
     * @return SubScene Filter sub-scenario.
     */
    public String getSubScene() {
        return this.SubScene;
    }

    /**
     * Set Filter sub-scenario.
     * @param SubScene Filter sub-scenario.
     */
    public void setSubScene(String SubScene) {
        this.SubScene = SubScene;
    }

    public CallDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallDetail(CallDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CallTime != null) {
            this.CallTime = new String(source.CallTime);
        }
        if (source.TotalTokenUsage != null) {
            this.TotalTokenUsage = new Float(source.TotalTokenUsage);
        }
        if (source.InputTokenUsage != null) {
            this.InputTokenUsage = new Float(source.InputTokenUsage);
        }
        if (source.OutputTokenUsage != null) {
            this.OutputTokenUsage = new Float(source.OutputTokenUsage);
        }
        if (source.SearchUsage != null) {
            this.SearchUsage = new Long(source.SearchUsage);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.CallType != null) {
            this.CallType = new String(source.CallType);
        }
        if (source.UinAccount != null) {
            this.UinAccount = new String(source.UinAccount);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PageUsage != null) {
            this.PageUsage = new Long(source.PageUsage);
        }
        if (source.SubScene != null) {
            this.SubScene = new String(source.SubScene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CallTime", this.CallTime);
        this.setParamSimple(map, prefix + "TotalTokenUsage", this.TotalTokenUsage);
        this.setParamSimple(map, prefix + "InputTokenUsage", this.InputTokenUsage);
        this.setParamSimple(map, prefix + "OutputTokenUsage", this.OutputTokenUsage);
        this.setParamSimple(map, prefix + "SearchUsage", this.SearchUsage);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "UinAccount", this.UinAccount);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageUsage", this.PageUsage);
        this.setParamSimple(map, prefix + "SubScene", this.SubScene);

    }
}

