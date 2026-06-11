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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisDimensional extends AbstractModel {

    /**
    * Analysis Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Analysis type: query (custom retrieval and analysis), field (TOP5 fields and proportion statistics), original (related raw logs)

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Analysis content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Multi-dimensional analysis configuration.

When the Type field of Analysis is query (custom), support
{
"Key": "SyntaxRule",  // Syntax rule
"Value": "1"  //0: Lucene syntax, 1: CQL syntax
}

When the Type field of Analysis is field (top5), it supports
 {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", //Query statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "SyntaxRule", // If this field cannot be found, it's assumed to be the legacy syntax (Lucene)
    "Value": "0"//0:Lucene, 1:CQL
}       

When the Type field of Analysis is original (raw log), it supports
{
    "Key": "Fields",
    "Value": "__SOURCE__,__HOSTNAME__,__TIMESTAMP__,__PKG_LOGID__,__TAG__.pod_ip"
}, {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", // Retrieval statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "Format", //Display format. 1: one log per line, 2: one field per line for each log entry
    "Value": "2"
},
{
"Key": "Limit", //Maximum number of logs
    "Value": "5"
},{
"Key": "SyntaxRule", // If this field is not found, it's also the old syntax
    "Value": "0"//0:Lucene, 1:CQL
}
    */
    @SerializedName("ConfigInfo")
    @Expose
    private AlarmAnalysisConfig [] ConfigInfo;

    /**
     * Get Analysis Name 
     * @return Name Analysis Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Analysis Name
     * @param Name Analysis Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Analysis type: query (custom retrieval and analysis), field (TOP5 fields and proportion statistics), original (related raw logs)
 
     * @return Type Analysis type: query (custom retrieval and analysis), field (TOP5 fields and proportion statistics), original (related raw logs)

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Analysis type: query (custom retrieval and analysis), field (TOP5 fields and proportion statistics), original (related raw logs)

     * @param Type Analysis type: query (custom retrieval and analysis), field (TOP5 fields and proportion statistics), original (related raw logs)

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Analysis content 
     * @return Content Analysis content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Analysis content
     * @param Content Analysis content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Multi-dimensional analysis configuration.

When the Type field of Analysis is query (custom), support
{
"Key": "SyntaxRule",  // Syntax rule
"Value": "1"  //0: Lucene syntax, 1: CQL syntax
}

When the Type field of Analysis is field (top5), it supports
 {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", //Query statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "SyntaxRule", // If this field cannot be found, it's assumed to be the legacy syntax (Lucene)
    "Value": "0"//0:Lucene, 1:CQL
}       

When the Type field of Analysis is original (raw log), it supports
{
    "Key": "Fields",
    "Value": "__SOURCE__,__HOSTNAME__,__TIMESTAMP__,__PKG_LOGID__,__TAG__.pod_ip"
}, {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", // Retrieval statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "Format", //Display format. 1: one log per line, 2: one field per line for each log entry
    "Value": "2"
},
{
"Key": "Limit", //Maximum number of logs
    "Value": "5"
},{
"Key": "SyntaxRule", // If this field is not found, it's also the old syntax
    "Value": "0"//0:Lucene, 1:CQL
} 
     * @return ConfigInfo Multi-dimensional analysis configuration.

When the Type field of Analysis is query (custom), support
{
"Key": "SyntaxRule",  // Syntax rule
"Value": "1"  //0: Lucene syntax, 1: CQL syntax
}

When the Type field of Analysis is field (top5), it supports
 {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", //Query statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "SyntaxRule", // If this field cannot be found, it's assumed to be the legacy syntax (Lucene)
    "Value": "0"//0:Lucene, 1:CQL
}       

When the Type field of Analysis is original (raw log), it supports
{
    "Key": "Fields",
    "Value": "__SOURCE__,__HOSTNAME__,__TIMESTAMP__,__PKG_LOGID__,__TAG__.pod_ip"
}, {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", // Retrieval statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "Format", //Display format. 1: one log per line, 2: one field per line for each log entry
    "Value": "2"
},
{
"Key": "Limit", //Maximum number of logs
    "Value": "5"
},{
"Key": "SyntaxRule", // If this field is not found, it's also the old syntax
    "Value": "0"//0:Lucene, 1:CQL
}
     */
    public AlarmAnalysisConfig [] getConfigInfo() {
        return this.ConfigInfo;
    }

    /**
     * Set Multi-dimensional analysis configuration.

When the Type field of Analysis is query (custom), support
{
"Key": "SyntaxRule",  // Syntax rule
"Value": "1"  //0: Lucene syntax, 1: CQL syntax
}

When the Type field of Analysis is field (top5), it supports
 {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", //Query statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "SyntaxRule", // If this field cannot be found, it's assumed to be the legacy syntax (Lucene)
    "Value": "0"//0:Lucene, 1:CQL
}       

When the Type field of Analysis is original (raw log), it supports
{
    "Key": "Fields",
    "Value": "__SOURCE__,__HOSTNAME__,__TIMESTAMP__,__PKG_LOGID__,__TAG__.pod_ip"
}, {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", // Retrieval statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "Format", //Display format. 1: one log per line, 2: one field per line for each log entry
    "Value": "2"
},
{
"Key": "Limit", //Maximum number of logs
    "Value": "5"
},{
"Key": "SyntaxRule", // If this field is not found, it's also the old syntax
    "Value": "0"//0:Lucene, 1:CQL
}
     * @param ConfigInfo Multi-dimensional analysis configuration.

When the Type field of Analysis is query (custom), support
{
"Key": "SyntaxRule",  // Syntax rule
"Value": "1"  //0: Lucene syntax, 1: CQL syntax
}

When the Type field of Analysis is field (top5), it supports
 {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", //Query statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "SyntaxRule", // If this field cannot be found, it's assumed to be the legacy syntax (Lucene)
    "Value": "0"//0:Lucene, 1:CQL
}       

When the Type field of Analysis is original (raw log), it supports
{
    "Key": "Fields",
    "Value": "__SOURCE__,__HOSTNAME__,__TIMESTAMP__,__PKG_LOGID__,__TAG__.pod_ip"
}, {
    "Key": "QueryIndex",
"Value": "-1" // -1: Custom, 1: Execute statement 1, 2: Execute statement 2
},{
"Key": "CustomQuery", // Retrieval statement. Required and valid when QueryIndex is -1.
    "Value": "* | select count(*) as count"
},{
"Key": "Format", //Display format. 1: one log per line, 2: one field per line for each log entry
    "Value": "2"
},
{
"Key": "Limit", //Maximum number of logs
    "Value": "5"
},{
"Key": "SyntaxRule", // If this field is not found, it's also the old syntax
    "Value": "0"//0:Lucene, 1:CQL
}
     */
    public void setConfigInfo(AlarmAnalysisConfig [] ConfigInfo) {
        this.ConfigInfo = ConfigInfo;
    }

    public AnalysisDimensional() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisDimensional(AnalysisDimensional source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ConfigInfo != null) {
            this.ConfigInfo = new AlarmAnalysisConfig[source.ConfigInfo.length];
            for (int i = 0; i < source.ConfigInfo.length; i++) {
                this.ConfigInfo[i] = new AlarmAnalysisConfig(source.ConfigInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "ConfigInfo.", this.ConfigInfo);

    }
}

