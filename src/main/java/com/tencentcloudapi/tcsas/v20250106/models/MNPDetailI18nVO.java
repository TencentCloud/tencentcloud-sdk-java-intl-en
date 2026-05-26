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

public class MNPDetailI18nVO extends AbstractModel {

    /**
    * Language ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Language type. Valid values: en-US: English; zh-CN: Simplified Chinese; zh-Hant: Traditional Chinese; fr-FR: French; ar-SA: Arabic; id-ID: Indonesian; vi-VN: Vietnamese. Default value: en-US.
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * Whether this is the default language. Valid values: 0: No; 1: Yes. Default value: 0.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Mini program name.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program introduction.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
     * Get Language ID. 
     * @return ID Language ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Language ID.
     * @param ID Language ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Language type. Valid values: en-US: English; zh-CN: Simplified Chinese; zh-Hant: Traditional Chinese; fr-FR: French; ar-SA: Arabic; id-ID: Indonesian; vi-VN: Vietnamese. Default value: en-US. 
     * @return Lang Language type. Valid values: en-US: English; zh-CN: Simplified Chinese; zh-Hant: Traditional Chinese; fr-FR: French; ar-SA: Arabic; id-ID: Indonesian; vi-VN: Vietnamese. Default value: en-US.
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set Language type. Valid values: en-US: English; zh-CN: Simplified Chinese; zh-Hant: Traditional Chinese; fr-FR: French; ar-SA: Arabic; id-ID: Indonesian; vi-VN: Vietnamese. Default value: en-US.
     * @param Lang Language type. Valid values: en-US: English; zh-CN: Simplified Chinese; zh-Hant: Traditional Chinese; fr-FR: French; ar-SA: Arabic; id-ID: Indonesian; vi-VN: Vietnamese. Default value: en-US.
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get Whether this is the default language. Valid values: 0: No; 1: Yes. Default value: 0. 
     * @return IsDefault Whether this is the default language. Valid values: 0: No; 1: Yes. Default value: 0.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether this is the default language. Valid values: 0: No; 1: Yes. Default value: 0.
     * @param IsDefault Whether this is the default language. Valid values: 0: No; 1: Yes. Default value: 0.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Mini program name. 
     * @return MNPName Mini program name.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name.
     * @param MNPName Mini program name.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program introduction. 
     * @return MNPIntro Mini program introduction.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction.
     * @param MNPIntro Mini program introduction.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    public MNPDetailI18nVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MNPDetailI18nVO(MNPDetailI18nVO source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);

    }
}

