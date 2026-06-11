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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMNPSubscribeMessageTemplateRequest extends AbstractModel {

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Mini program appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Subscription message template library ID.</p>
    */
    @SerializedName("TemplateLibraryId")
    @Expose
    private String TemplateLibraryId;

    /**
    * <p>Subscription message template keyword.</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * <p>Subscription message template scenario description.</p>
    */
    @SerializedName("ScenarioDescription")
    @Expose
    private String ScenarioDescription;

    /**
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Mini program appid.</p> 
     * @return MNPId <p>Mini program appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program appid.</p>
     * @param MNPId <p>Mini program appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Subscription message template library ID.</p> 
     * @return TemplateLibraryId <p>Subscription message template library ID.</p>
     */
    public String getTemplateLibraryId() {
        return this.TemplateLibraryId;
    }

    /**
     * Set <p>Subscription message template library ID.</p>
     * @param TemplateLibraryId <p>Subscription message template library ID.</p>
     */
    public void setTemplateLibraryId(String TemplateLibraryId) {
        this.TemplateLibraryId = TemplateLibraryId;
    }

    /**
     * Get <p>Subscription message template keyword.</p> 
     * @return Keywords <p>Subscription message template keyword.</p>
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>Subscription message template keyword.</p>
     * @param Keywords <p>Subscription message template keyword.</p>
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>Subscription message template scenario description.</p> 
     * @return ScenarioDescription <p>Subscription message template scenario description.</p>
     */
    public String getScenarioDescription() {
        return this.ScenarioDescription;
    }

    /**
     * Set <p>Subscription message template scenario description.</p>
     * @param ScenarioDescription <p>Subscription message template scenario description.</p>
     */
    public void setScenarioDescription(String ScenarioDescription) {
        this.ScenarioDescription = ScenarioDescription;
    }

    public CreateMNPSubscribeMessageTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMNPSubscribeMessageTemplateRequest(CreateMNPSubscribeMessageTemplateRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.TemplateLibraryId != null) {
            this.TemplateLibraryId = new String(source.TemplateLibraryId);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.ScenarioDescription != null) {
            this.ScenarioDescription = new String(source.ScenarioDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "TemplateLibraryId", this.TemplateLibraryId);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "ScenarioDescription", this.ScenarioDescription);

    }
}

