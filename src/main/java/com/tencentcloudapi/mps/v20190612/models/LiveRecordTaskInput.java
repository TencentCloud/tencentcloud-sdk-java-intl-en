/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveRecordTaskInput extends AbstractModel{

    /**
    * The live recording template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The storage of the recording file. If this parameter is left empty, the `OutputStorage` value of the parent folder will be inherited.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * The output path of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
     * Get The live recording template ID. 
     * @return Definition The live recording template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The live recording template ID.
     * @param Definition The live recording template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The storage of the recording file. If this parameter is left empty, the `OutputStorage` value of the parent folder will be inherited.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutputStorage The storage of the recording file. If this parameter is left empty, the `OutputStorage` value of the parent folder will be inherited.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set The storage of the recording file. If this parameter is left empty, the `OutputStorage` value of the parent folder will be inherited.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutputStorage The storage of the recording file. If this parameter is left empty, the `OutputStorage` value of the parent folder will be inherited.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get The output path of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return OutputObjectPath The output path of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set The output path of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param OutputObjectPath The output path of the recording file.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    public LiveRecordTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordTaskInput(LiveRecordTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);

    }
}

