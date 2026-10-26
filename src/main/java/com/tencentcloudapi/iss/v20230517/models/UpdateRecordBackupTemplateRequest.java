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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordBackupTemplateRequest extends AbstractModel {

    /**
    * Template ID (obtain from the ListRecordBackupTemplates API for querying the video recording cloud template list)
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Modify the template data for video recording upload to cloud
    */
    @SerializedName("Mod")
    @Expose
    private UpdateRecordBackupTemplateModify Mod;

    /**
     * Get Template ID (obtain from the ListRecordBackupTemplates API for querying the video recording cloud template list) 
     * @return TemplateId Template ID (obtain from the ListRecordBackupTemplates API for querying the video recording cloud template list)
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID (obtain from the ListRecordBackupTemplates API for querying the video recording cloud template list)
     * @param TemplateId Template ID (obtain from the ListRecordBackupTemplates API for querying the video recording cloud template list)
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Modify the template data for video recording upload to cloud 
     * @return Mod Modify the template data for video recording upload to cloud
     */
    public UpdateRecordBackupTemplateModify getMod() {
        return this.Mod;
    }

    /**
     * Set Modify the template data for video recording upload to cloud
     * @param Mod Modify the template data for video recording upload to cloud
     */
    public void setMod(UpdateRecordBackupTemplateModify Mod) {
        this.Mod = Mod;
    }

    public UpdateRecordBackupTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordBackupTemplateRequest(UpdateRecordBackupTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Mod != null) {
            this.Mod = new UpdateRecordBackupTemplateModify(source.Mod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "Mod.", this.Mod);

    }
}

