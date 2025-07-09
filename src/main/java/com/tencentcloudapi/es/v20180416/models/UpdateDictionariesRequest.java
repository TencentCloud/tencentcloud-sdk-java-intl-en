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
    * ES instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * COS address of the main dictionary for the IK analyzer
    */
    @SerializedName("IkMainDicts")
    @Expose
    private String [] IkMainDicts;

    /**
    * COS address of the stopword dictionary for the IK analyzer
    */
    @SerializedName("IkStopwords")
    @Expose
    private String [] IkStopwords;

    /**
    * COS address of the synonym dictionary
    */
    @SerializedName("Synonym")
    @Expose
    private String [] Synonym;

    /**
    * COS address of the QQ dictionary
    */
    @SerializedName("QQDict")
    @Expose
    private String [] QQDict;

    /**
    * `0` (default): Install, `1`: Delete
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * Whether to force restart the cluster. The default value is `false`.
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get ES instance ID 
     * @return InstanceId ES instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES instance ID
     * @param InstanceId ES instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get COS address of the main dictionary for the IK analyzer 
     * @return IkMainDicts COS address of the main dictionary for the IK analyzer
     */
    public String [] getIkMainDicts() {
        return this.IkMainDicts;
    }

    /**
     * Set COS address of the main dictionary for the IK analyzer
     * @param IkMainDicts COS address of the main dictionary for the IK analyzer
     */
    public void setIkMainDicts(String [] IkMainDicts) {
        this.IkMainDicts = IkMainDicts;
    }

    /**
     * Get COS address of the stopword dictionary for the IK analyzer 
     * @return IkStopwords COS address of the stopword dictionary for the IK analyzer
     */
    public String [] getIkStopwords() {
        return this.IkStopwords;
    }

    /**
     * Set COS address of the stopword dictionary for the IK analyzer
     * @param IkStopwords COS address of the stopword dictionary for the IK analyzer
     */
    public void setIkStopwords(String [] IkStopwords) {
        this.IkStopwords = IkStopwords;
    }

    /**
     * Get COS address of the synonym dictionary 
     * @return Synonym COS address of the synonym dictionary
     */
    public String [] getSynonym() {
        return this.Synonym;
    }

    /**
     * Set COS address of the synonym dictionary
     * @param Synonym COS address of the synonym dictionary
     */
    public void setSynonym(String [] Synonym) {
        this.Synonym = Synonym;
    }

    /**
     * Get COS address of the QQ dictionary 
     * @return QQDict COS address of the QQ dictionary
     */
    public String [] getQQDict() {
        return this.QQDict;
    }

    /**
     * Set COS address of the QQ dictionary
     * @param QQDict COS address of the QQ dictionary
     */
    public void setQQDict(String [] QQDict) {
        this.QQDict = QQDict;
    }

    /**
     * Get `0` (default): Install, `1`: Delete 
     * @return UpdateType `0` (default): Install, `1`: Delete
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set `0` (default): Install, `1`: Delete
     * @param UpdateType `0` (default): Install, `1`: Delete
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get Whether to force restart the cluster. The default value is `false`. 
     * @return ForceRestart Whether to force restart the cluster. The default value is `false`.
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart the cluster. The default value is `false`.
     * @param ForceRestart Whether to force restart the cluster. The default value is `false`.
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

