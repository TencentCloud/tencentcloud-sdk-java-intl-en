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

public class AppAdvancedConf extends AbstractModel {

    /**
    * <p>Whether to enable context rewrite</p>
    */
    @SerializedName("EnableContextRewrite")
    @Expose
    private Boolean EnableContextRewrite;

    /**
    * <p>Whether to enable image and text retrieval.</p>
    */
    @SerializedName("EnableImageTextRetrieval")
    @Expose
    private Boolean EnableImageTextRetrieval;

    /**
    * <p>Reply flexibility</p>
    */
    @SerializedName("ReplyFlexibility")
    @Expose
    private Long ReplyFlexibility;

    /**
    * <p>Custom configuration on the dialogue side (shared across all modes, with permission to modify configuration dynamically during a dialogue)</p>
    */
    @SerializedName("DialogCustomConfig")
    @Expose
    private DialogCustomConfig DialogCustomConfig;

    /**
    * <p>Intent attainment priority</p>
    */
    @SerializedName("IntentAchievement")
    @Expose
    private IntentAchievementInfo [] IntentAchievement;

    /**
     * Get <p>Whether to enable context rewrite</p> 
     * @return EnableContextRewrite <p>Whether to enable context rewrite</p>
     */
    public Boolean getEnableContextRewrite() {
        return this.EnableContextRewrite;
    }

    /**
     * Set <p>Whether to enable context rewrite</p>
     * @param EnableContextRewrite <p>Whether to enable context rewrite</p>
     */
    public void setEnableContextRewrite(Boolean EnableContextRewrite) {
        this.EnableContextRewrite = EnableContextRewrite;
    }

    /**
     * Get <p>Whether to enable image and text retrieval.</p> 
     * @return EnableImageTextRetrieval <p>Whether to enable image and text retrieval.</p>
     */
    public Boolean getEnableImageTextRetrieval() {
        return this.EnableImageTextRetrieval;
    }

    /**
     * Set <p>Whether to enable image and text retrieval.</p>
     * @param EnableImageTextRetrieval <p>Whether to enable image and text retrieval.</p>
     */
    public void setEnableImageTextRetrieval(Boolean EnableImageTextRetrieval) {
        this.EnableImageTextRetrieval = EnableImageTextRetrieval;
    }

    /**
     * Get <p>Reply flexibility</p> 
     * @return ReplyFlexibility <p>Reply flexibility</p>
     */
    public Long getReplyFlexibility() {
        return this.ReplyFlexibility;
    }

    /**
     * Set <p>Reply flexibility</p>
     * @param ReplyFlexibility <p>Reply flexibility</p>
     */
    public void setReplyFlexibility(Long ReplyFlexibility) {
        this.ReplyFlexibility = ReplyFlexibility;
    }

    /**
     * Get <p>Custom configuration on the dialogue side (shared across all modes, with permission to modify configuration dynamically during a dialogue)</p> 
     * @return DialogCustomConfig <p>Custom configuration on the dialogue side (shared across all modes, with permission to modify configuration dynamically during a dialogue)</p>
     */
    public DialogCustomConfig getDialogCustomConfig() {
        return this.DialogCustomConfig;
    }

    /**
     * Set <p>Custom configuration on the dialogue side (shared across all modes, with permission to modify configuration dynamically during a dialogue)</p>
     * @param DialogCustomConfig <p>Custom configuration on the dialogue side (shared across all modes, with permission to modify configuration dynamically during a dialogue)</p>
     */
    public void setDialogCustomConfig(DialogCustomConfig DialogCustomConfig) {
        this.DialogCustomConfig = DialogCustomConfig;
    }

    /**
     * Get <p>Intent attainment priority</p> 
     * @return IntentAchievement <p>Intent attainment priority</p>
     */
    public IntentAchievementInfo [] getIntentAchievement() {
        return this.IntentAchievement;
    }

    /**
     * Set <p>Intent attainment priority</p>
     * @param IntentAchievement <p>Intent attainment priority</p>
     */
    public void setIntentAchievement(IntentAchievementInfo [] IntentAchievement) {
        this.IntentAchievement = IntentAchievement;
    }

    public AppAdvancedConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAdvancedConf(AppAdvancedConf source) {
        if (source.EnableContextRewrite != null) {
            this.EnableContextRewrite = new Boolean(source.EnableContextRewrite);
        }
        if (source.EnableImageTextRetrieval != null) {
            this.EnableImageTextRetrieval = new Boolean(source.EnableImageTextRetrieval);
        }
        if (source.ReplyFlexibility != null) {
            this.ReplyFlexibility = new Long(source.ReplyFlexibility);
        }
        if (source.DialogCustomConfig != null) {
            this.DialogCustomConfig = new DialogCustomConfig(source.DialogCustomConfig);
        }
        if (source.IntentAchievement != null) {
            this.IntentAchievement = new IntentAchievementInfo[source.IntentAchievement.length];
            for (int i = 0; i < source.IntentAchievement.length; i++) {
                this.IntentAchievement[i] = new IntentAchievementInfo(source.IntentAchievement[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableContextRewrite", this.EnableContextRewrite);
        this.setParamSimple(map, prefix + "EnableImageTextRetrieval", this.EnableImageTextRetrieval);
        this.setParamSimple(map, prefix + "ReplyFlexibility", this.ReplyFlexibility);
        this.setParamObj(map, prefix + "DialogCustomConfig.", this.DialogCustomConfig);
        this.setParamArrayObj(map, prefix + "IntentAchievement.", this.IntentAchievement);

    }
}

