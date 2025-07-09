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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrHotwordsSet extends AbstractModel {

    /**
    * Hotword lexicon ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * Current hotword lexicon status. The value indicates the number of smart subtitle templates bound to this hotword lexicon.
If the value of Status is 0, it indicates that the hotword lexicon is not referenced by any smart subtitle template and that it can be deleted.
If the value of Status is not 0, it indicates that the hotword lexicon cannot be deleted.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Hotword lexicon name.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of hotwords in the hotword lexicon.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WordCount")
    @Expose
    private Long WordCount;

    /**
    * Name of the uploaded hotword file.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 0: temporary hotword lexicon
1: file-based hotword lexicon
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Hotword lexicon ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return HotwordsId Hotword lexicon ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set Hotword lexicon ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param HotwordsId Hotword lexicon ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get Current hotword lexicon status. The value indicates the number of smart subtitle templates bound to this hotword lexicon.
If the value of Status is 0, it indicates that the hotword lexicon is not referenced by any smart subtitle template and that it can be deleted.
If the value of Status is not 0, it indicates that the hotword lexicon cannot be deleted.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Current hotword lexicon status. The value indicates the number of smart subtitle templates bound to this hotword lexicon.
If the value of Status is 0, it indicates that the hotword lexicon is not referenced by any smart subtitle template and that it can be deleted.
If the value of Status is not 0, it indicates that the hotword lexicon cannot be deleted.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current hotword lexicon status. The value indicates the number of smart subtitle templates bound to this hotword lexicon.
If the value of Status is 0, it indicates that the hotword lexicon is not referenced by any smart subtitle template and that it can be deleted.
If the value of Status is not 0, it indicates that the hotword lexicon cannot be deleted.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Current hotword lexicon status. The value indicates the number of smart subtitle templates bound to this hotword lexicon.
If the value of Status is 0, it indicates that the hotword lexicon is not referenced by any smart subtitle template and that it can be deleted.
If the value of Status is not 0, it indicates that the hotword lexicon cannot be deleted.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Hotword lexicon name.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Hotword lexicon name.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Hotword lexicon name.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Name Hotword lexicon name.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of hotwords in the hotword lexicon.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WordCount Number of hotwords in the hotword lexicon.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getWordCount() {
        return this.WordCount;
    }

    /**
     * Set Number of hotwords in the hotword lexicon.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WordCount Number of hotwords in the hotword lexicon.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWordCount(Long WordCount) {
        this.WordCount = WordCount;
    }

    /**
     * Get Name of the uploaded hotword file.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FileName Name of the uploaded hotword file.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Name of the uploaded hotword file.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FileName Name of the uploaded hotword file.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Creation time of the hotword lexicon in ISO datetime format (UTC time). For example, 2006-01-02T15:04:05Z.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 0: temporary hotword lexicon
1: file-based hotword lexicon
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type 0: temporary hotword lexicon
1: file-based hotword lexicon
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: temporary hotword lexicon
1: file-based hotword lexicon
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type 0: temporary hotword lexicon
1: file-based hotword lexicon
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public AsrHotwordsSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrHotwordsSet(AsrHotwordsSet source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WordCount != null) {
            this.WordCount = new Long(source.WordCount);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "WordCount", this.WordCount);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

