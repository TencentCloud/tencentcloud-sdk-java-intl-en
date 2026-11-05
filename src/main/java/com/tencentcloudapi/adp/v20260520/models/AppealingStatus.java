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

public class AppealingStatus extends AbstractModel {

    /**
    * Whether the avatar is under appeal
    */
    @SerializedName("AvatarInAppeal")
    @Expose
    private Boolean AvatarInAppeal;

    /**
    * Is the fallback response included in the appeal?
    */
    @SerializedName("FallbackReplyInAppeal")
    @Expose
    private Boolean FallbackReplyInAppeal;

    /**
    * Whether the welcome message is required in an appeal
    */
    @SerializedName("GreetingInAppeal")
    @Expose
    private Boolean GreetingInAppeal;

    /**
    * Whether the application name is under appeal
    */
    @SerializedName("NameInAppeal")
    @Expose
    private Boolean NameInAppeal;

    /**
    * Whether the role description is in the appeal
    */
    @SerializedName("RoleInAppeal")
    @Expose
    private Boolean RoleInAppeal;

    /**
     * Get Whether the avatar is under appeal 
     * @return AvatarInAppeal Whether the avatar is under appeal
     */
    public Boolean getAvatarInAppeal() {
        return this.AvatarInAppeal;
    }

    /**
     * Set Whether the avatar is under appeal
     * @param AvatarInAppeal Whether the avatar is under appeal
     */
    public void setAvatarInAppeal(Boolean AvatarInAppeal) {
        this.AvatarInAppeal = AvatarInAppeal;
    }

    /**
     * Get Is the fallback response included in the appeal? 
     * @return FallbackReplyInAppeal Is the fallback response included in the appeal?
     */
    public Boolean getFallbackReplyInAppeal() {
        return this.FallbackReplyInAppeal;
    }

    /**
     * Set Is the fallback response included in the appeal?
     * @param FallbackReplyInAppeal Is the fallback response included in the appeal?
     */
    public void setFallbackReplyInAppeal(Boolean FallbackReplyInAppeal) {
        this.FallbackReplyInAppeal = FallbackReplyInAppeal;
    }

    /**
     * Get Whether the welcome message is required in an appeal 
     * @return GreetingInAppeal Whether the welcome message is required in an appeal
     */
    public Boolean getGreetingInAppeal() {
        return this.GreetingInAppeal;
    }

    /**
     * Set Whether the welcome message is required in an appeal
     * @param GreetingInAppeal Whether the welcome message is required in an appeal
     */
    public void setGreetingInAppeal(Boolean GreetingInAppeal) {
        this.GreetingInAppeal = GreetingInAppeal;
    }

    /**
     * Get Whether the application name is under appeal 
     * @return NameInAppeal Whether the application name is under appeal
     */
    public Boolean getNameInAppeal() {
        return this.NameInAppeal;
    }

    /**
     * Set Whether the application name is under appeal
     * @param NameInAppeal Whether the application name is under appeal
     */
    public void setNameInAppeal(Boolean NameInAppeal) {
        this.NameInAppeal = NameInAppeal;
    }

    /**
     * Get Whether the role description is in the appeal 
     * @return RoleInAppeal Whether the role description is in the appeal
     */
    public Boolean getRoleInAppeal() {
        return this.RoleInAppeal;
    }

    /**
     * Set Whether the role description is in the appeal
     * @param RoleInAppeal Whether the role description is in the appeal
     */
    public void setRoleInAppeal(Boolean RoleInAppeal) {
        this.RoleInAppeal = RoleInAppeal;
    }

    public AppealingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppealingStatus(AppealingStatus source) {
        if (source.AvatarInAppeal != null) {
            this.AvatarInAppeal = new Boolean(source.AvatarInAppeal);
        }
        if (source.FallbackReplyInAppeal != null) {
            this.FallbackReplyInAppeal = new Boolean(source.FallbackReplyInAppeal);
        }
        if (source.GreetingInAppeal != null) {
            this.GreetingInAppeal = new Boolean(source.GreetingInAppeal);
        }
        if (source.NameInAppeal != null) {
            this.NameInAppeal = new Boolean(source.NameInAppeal);
        }
        if (source.RoleInAppeal != null) {
            this.RoleInAppeal = new Boolean(source.RoleInAppeal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvatarInAppeal", this.AvatarInAppeal);
        this.setParamSimple(map, prefix + "FallbackReplyInAppeal", this.FallbackReplyInAppeal);
        this.setParamSimple(map, prefix + "GreetingInAppeal", this.GreetingInAppeal);
        this.setParamSimple(map, prefix + "NameInAppeal", this.NameInAppeal);
        this.setParamSimple(map, prefix + "RoleInAppeal", this.RoleInAppeal);

    }
}

