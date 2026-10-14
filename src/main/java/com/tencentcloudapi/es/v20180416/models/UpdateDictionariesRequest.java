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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDictionariesRequest extends AbstractModel {

    /**
    * ES instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Address of the COS main dictionary for IK word segmentation entered during installation, and the dictionary name such as test.dic entered during deletion.
    */
    @SerializedName("IkMainDicts")
    @Expose
    private String [] IkMainDicts;

    /**
    * Address of the COS stopword dictionary for IK word segmentation during installation. When deleting, enter the dictionary name, for example, test.dic.
    */
    @SerializedName("IkStopwords")
    @Expose
    private String [] IkStopwords;

    /**
    * Address of the synonym dictionary COS during installation, and the dictionary name such as test.dic when deleting.
    */
    @SerializedName("Synonym")
    @Expose
    private String [] Synonym;

    /**
    * Address of the COS QQ tokenizer dictionary during installation, and the dictionary name such as test.dic during deletion.
    */
    @SerializedName("QQDict")
    @Expose
    private String [] QQDict;

    /**
    * 0: installation; 1: deletion. Default value: 0
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * Whether to force restart the cluster. Default value: false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get ES instance ID. 
     * @return InstanceId ES instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES instance ID.
     * @param InstanceId ES instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Address of the COS main dictionary for IK word segmentation entered during installation, and the dictionary name such as test.dic entered during deletion. 
     * @return IkMainDicts Address of the COS main dictionary for IK word segmentation entered during installation, and the dictionary name such as test.dic entered during deletion.
     */
    public String [] getIkMainDicts() {
        return this.IkMainDicts;
    }

    /**
     * Set Address of the COS main dictionary for IK word segmentation entered during installation, and the dictionary name such as test.dic entered during deletion.
     * @param IkMainDicts Address of the COS main dictionary for IK word segmentation entered during installation, and the dictionary name such as test.dic entered during deletion.
     */
    public void setIkMainDicts(String [] IkMainDicts) {
        this.IkMainDicts = IkMainDicts;
    }

    /**
     * Get Address of the COS stopword dictionary for IK word segmentation during installation. When deleting, enter the dictionary name, for example, test.dic. 
     * @return IkStopwords Address of the COS stopword dictionary for IK word segmentation during installation. When deleting, enter the dictionary name, for example, test.dic.
     */
    public String [] getIkStopwords() {
        return this.IkStopwords;
    }

    /**
     * Set Address of the COS stopword dictionary for IK word segmentation during installation. When deleting, enter the dictionary name, for example, test.dic.
     * @param IkStopwords Address of the COS stopword dictionary for IK word segmentation during installation. When deleting, enter the dictionary name, for example, test.dic.
     */
    public void setIkStopwords(String [] IkStopwords) {
        this.IkStopwords = IkStopwords;
    }

    /**
     * Get Address of the synonym dictionary COS during installation, and the dictionary name such as test.dic when deleting. 
     * @return Synonym Address of the synonym dictionary COS during installation, and the dictionary name such as test.dic when deleting.
     */
    public String [] getSynonym() {
        return this.Synonym;
    }

    /**
     * Set Address of the synonym dictionary COS during installation, and the dictionary name such as test.dic when deleting.
     * @param Synonym Address of the synonym dictionary COS during installation, and the dictionary name such as test.dic when deleting.
     */
    public void setSynonym(String [] Synonym) {
        this.Synonym = Synonym;
    }

    /**
     * Get Address of the COS QQ tokenizer dictionary during installation, and the dictionary name such as test.dic during deletion. 
     * @return QQDict Address of the COS QQ tokenizer dictionary during installation, and the dictionary name such as test.dic during deletion.
     */
    public String [] getQQDict() {
        return this.QQDict;
    }

    /**
     * Set Address of the COS QQ tokenizer dictionary during installation, and the dictionary name such as test.dic during deletion.
     * @param QQDict Address of the COS QQ tokenizer dictionary during installation, and the dictionary name such as test.dic during deletion.
     */
    public void setQQDict(String [] QQDict) {
        this.QQDict = QQDict;
    }

    /**
     * Get 0: installation; 1: deletion. Default value: 0 
     * @return UpdateType 0: installation; 1: deletion. Default value: 0
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 0: installation; 1: deletion. Default value: 0
     * @param UpdateType 0: installation; 1: deletion. Default value: 0
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get Whether to force restart the cluster. Default value: false 
     * @return ForceRestart Whether to force restart the cluster. Default value: false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart the cluster. Default value: false
     * @param ForceRestart Whether to force restart the cluster. Default value: false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    public UpdateDictionariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDictionariesRequest(UpdateDictionariesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IkMainDicts != null) {
            this.IkMainDicts = new String[source.IkMainDicts.length];
            for (int i = 0; i < source.IkMainDicts.length; i++) {
                this.IkMainDicts[i] = new String(source.IkMainDicts[i]);
            }
        }
        if (source.IkStopwords != null) {
            this.IkStopwords = new String[source.IkStopwords.length];
            for (int i = 0; i < source.IkStopwords.length; i++) {
                this.IkStopwords[i] = new String(source.IkStopwords[i]);
            }
        }
        if (source.Synonym != null) {
            this.Synonym = new String[source.Synonym.length];
            for (int i = 0; i < source.Synonym.length; i++) {
                this.Synonym[i] = new String(source.Synonym[i]);
            }
        }
        if (source.QQDict != null) {
            this.QQDict = new String[source.QQDict.length];
            for (int i = 0; i < source.QQDict.length; i++) {
                this.QQDict[i] = new String(source.QQDict[i]);
            }
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "IkMainDicts.", this.IkMainDicts);
        this.setParamArraySimple(map, prefix + "IkStopwords.", this.IkStopwords);
        this.setParamArraySimple(map, prefix + "Synonym.", this.Synonym);
        this.setParamArraySimple(map, prefix + "QQDict.", this.QQDict);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

