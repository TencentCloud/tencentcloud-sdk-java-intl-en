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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReconstructDocumentFlowConfig extends AbstractModel {

    /**
    * The returned form of a table in a markdown file: 
0: the table is returned in MD format;
1: the table is returned in HTML form.
The default is 1.
    */
    @SerializedName("TableResultType")
    @Expose
    private String TableResultType;

    /**
    * The format of smart document parsing results:
0: only return full-text MD;
1: only return OCR original JSON of each page;.
2: only return MD of each page;
3: return full-text MD + OCR original JSON of each page;.
4: return full-text MD + MD of each page.
The default value is 3 (return full-text MD + OCR original JSON of each page).

    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
     * Get The returned form of a table in a markdown file: 
0: the table is returned in MD format;
1: the table is returned in HTML form.
The default is 1. 
     * @return TableResultType The returned form of a table in a markdown file: 
0: the table is returned in MD format;
1: the table is returned in HTML form.
The default is 1.
     */
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set The returned form of a table in a markdown file: 
0: the table is returned in MD format;
1: the table is returned in HTML form.
The default is 1.
     * @param TableResultType The returned form of a table in a markdown file: 
0: the table is returned in MD format;
1: the table is returned in HTML form.
The default is 1.
     */
    public void setTableResultType(String TableResultType) {
        this.TableResultType = TableResultType;
    }

    /**
     * Get The format of smart document parsing results:
0: only return full-text MD;
1: only return OCR original JSON of each page;.
2: only return MD of each page;
3: return full-text MD + OCR original JSON of each page;.
4: return full-text MD + MD of each page.
The default value is 3 (return full-text MD + OCR original JSON of each page).
 
     * @return ResultType The format of smart document parsing results:
0: only return full-text MD;
1: only return OCR original JSON of each page;.
2: only return MD of each page;
3: return full-text MD + OCR original JSON of each page;.
4: return full-text MD + MD of each page.
The default value is 3 (return full-text MD + OCR original JSON of each page).

     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set The format of smart document parsing results:
0: only return full-text MD;
1: only return OCR original JSON of each page;.
2: only return MD of each page;
3: return full-text MD + OCR original JSON of each page;.
4: return full-text MD + MD of each page.
The default value is 3 (return full-text MD + OCR original JSON of each page).

     * @param ResultType The format of smart document parsing results:
0: only return full-text MD;
1: only return OCR original JSON of each page;.
2: only return MD of each page;
3: return full-text MD + OCR original JSON of each page;.
4: return full-text MD + MD of each page.
The default value is 3 (return full-text MD + OCR original JSON of each page).

     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    public CreateReconstructDocumentFlowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReconstructDocumentFlowConfig(CreateReconstructDocumentFlowConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableResultType", this.TableResultType);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);

    }
}

