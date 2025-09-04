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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSplitDocumentFlowConfig extends AbstractModel {

    /**
    * The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
    */
    @SerializedName("TableResultType")
    @Expose
    private String TableResultType;

    /**
    * The format of the returned results of intelligent document parsing.
- 0: only returns full-text MD.
- 1: only returns the OCR original Json for each page.
- 2: only returns the MD of each page.
- 3: returns the full-text MD and the original OCR Json of each page.
- 4: returns full-text MD and MD of each page.
The default value is 3 (returns the full-text MD and the original OCR Json of each page).
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * Whether to enable mllm.
    */
    @SerializedName("EnableMllm")
    @Expose
    private Boolean EnableMllm;

    /**
    * Max segment length.
    */
    @SerializedName("MaxChunkSize")
    @Expose
    private Long MaxChunkSize;

    /**
     * Get The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML. 
     * @return TableResultType The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
     * @deprecated
     */
    @Deprecated
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
     * @param TableResultType The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
     * @deprecated
     */
    @Deprecated
    public void setTableResultType(String TableResultType) {
        this.TableResultType = TableResultType;
    }

    /**
     * Get The format of the returned results of intelligent document parsing.
- 0: only returns full-text MD.
- 1: only returns the OCR original Json for each page.
- 2: only returns the MD of each page.
- 3: returns the full-text MD and the original OCR Json of each page.
- 4: returns full-text MD and MD of each page.
The default value is 3 (returns the full-text MD and the original OCR Json of each page). 
     * @return ResultType The format of the returned results of intelligent document parsing.
- 0: only returns full-text MD.
- 1: only returns the OCR original Json for each page.
- 2: only returns the MD of each page.
- 3: returns the full-text MD and the original OCR Json of each page.
- 4: returns full-text MD and MD of each page.
The default value is 3 (returns the full-text MD and the original OCR Json of each page).
     * @deprecated
     */
    @Deprecated
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set The format of the returned results of intelligent document parsing.
- 0: only returns full-text MD.
- 1: only returns the OCR original Json for each page.
- 2: only returns the MD of each page.
- 3: returns the full-text MD and the original OCR Json of each page.
- 4: returns full-text MD and MD of each page.
The default value is 3 (returns the full-text MD and the original OCR Json of each page).
     * @param ResultType The format of the returned results of intelligent document parsing.
- 0: only returns full-text MD.
- 1: only returns the OCR original Json for each page.
- 2: only returns the MD of each page.
- 3: returns the full-text MD and the original OCR Json of each page.
- 4: returns full-text MD and MD of each page.
The default value is 3 (returns the full-text MD and the original OCR Json of each page).
     * @deprecated
     */
    @Deprecated
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get Whether to enable mllm. 
     * @return EnableMllm Whether to enable mllm.
     */
    public Boolean getEnableMllm() {
        return this.EnableMllm;
    }

    /**
     * Set Whether to enable mllm.
     * @param EnableMllm Whether to enable mllm.
     */
    public void setEnableMllm(Boolean EnableMllm) {
        this.EnableMllm = EnableMllm;
    }

    /**
     * Get Max segment length. 
     * @return MaxChunkSize Max segment length.
     */
    public Long getMaxChunkSize() {
        return this.MaxChunkSize;
    }

    /**
     * Set Max segment length.
     * @param MaxChunkSize Max segment length.
     */
    public void setMaxChunkSize(Long MaxChunkSize) {
        this.MaxChunkSize = MaxChunkSize;
    }

    public CreateSplitDocumentFlowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSplitDocumentFlowConfig(CreateSplitDocumentFlowConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.EnableMllm != null) {
            this.EnableMllm = new Boolean(source.EnableMllm);
        }
        if (source.MaxChunkSize != null) {
            this.MaxChunkSize = new Long(source.MaxChunkSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableResultType", this.TableResultType);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "EnableMllm", this.EnableMllm);
        this.setParamSimple(map, prefix + "MaxChunkSize", this.MaxChunkSize);

    }
}

