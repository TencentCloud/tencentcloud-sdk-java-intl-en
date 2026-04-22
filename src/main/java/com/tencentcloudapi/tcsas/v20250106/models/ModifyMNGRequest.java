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

public class ModifyMNGRequest extends AbstractModel {

    /**
    * <p>Mini game type</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Mini game name</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini game introduction</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Mini game description</p>
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Platform ID</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Mini game icon</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
     * Get <p>Mini game type</p> 
     * @return MNPType <p>Mini game type</p>
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set <p>Mini game type</p>
     * @param MNPType <p>Mini game type</p>
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get <p>Mini game name</p> 
     * @return MNPName <p>Mini game name</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini game name</p>
     * @param MNPName <p>Mini game name</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini game introduction</p> 
     * @return MNPIntro <p>Mini game introduction</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini game introduction</p>
     * @param MNPIntro <p>Mini game introduction</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get <p>Mini game description</p> 
     * @return MNPDesc <p>Mini game description</p>
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set <p>Mini game description</p>
     * @param MNPDesc <p>Mini game description</p>
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Platform ID</p> 
     * @return PlatformId <p>Platform ID</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID</p>
     * @param PlatformId <p>Platform ID</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Mini game icon</p> 
     * @return MNPIcon <p>Mini game icon</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini game icon</p>
     * @param MNPIcon <p>Mini game icon</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    public ModifyMNGRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMNGRequest(ModifyMNGRequest source) {
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);

    }
}

