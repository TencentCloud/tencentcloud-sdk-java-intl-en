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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListQualityRuleTemplatesRequest extends AbstractModel {

    /**
    * Workspace ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Current page, which is 1 by default.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of records per page, which is 10 by default.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Common sort.
Supported sorting fields:.
CitationCount - sort by number of references.
UpdateTime - sort by update time.
Sorting order:.
1 - ascending (ASC).
2 - descending (DESC).
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * Universal filter criteria.
1. Id
Description: template ID.
Value: unique identifier of the template.

2. Keyword
Description: search by keyword, supports template name fuzzy search.
Value: string.

3. Type
Description: template type.
Value: 1 - system template; 2 - custom template; support multiple values (OR relationship).

4. QualityDim
Describes the quality detection dimension.
Valid values: 1 - accuracy; 2 - uniqueness; 3 - integrity; 4 - consistency; 5 - timeliness; 6 - validity. support multiple values (OR relationship).

5. SourceObjectType
Describes the applicable source data object type for rule.
Value: 1 - constant; 2 - offline table level; 3 - offline field level; 4 - database level. supports multiple values (OR relationship).

6. SourceEngineTypes
Description: specifies the source data engine type to which the template applies.
Value: 1 - MySQL; 2 - Hive; 4 - Spark; 8 - Livy; 16 - DLC; 32 - Gbase; 64 - TCHouse-P; 128 - Doris; 256 - TCHouse-D; 512 - EMR_StarRocks; 1024 - TCHouse-X. supports multiple values (OR relationship).

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Workspace ID. 
     * @return ProjectId Workspace ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Workspace ID.
     * @param ProjectId Workspace ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Current page, which is 1 by default. 
     * @return PageNumber Current page, which is 1 by default.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current page, which is 1 by default.
     * @param PageNumber Current page, which is 1 by default.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of records per page, which is 10 by default. 
     * @return PageSize Number of records per page, which is 10 by default.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page, which is 10 by default.
     * @param PageSize Number of records per page, which is 10 by default.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Common sort.
Supported sorting fields:.
CitationCount - sort by number of references.
UpdateTime - sort by update time.
Sorting order:.
1 - ascending (ASC).
2 - descending (DESC). 
     * @return OrderFields Common sort.
Supported sorting fields:.
CitationCount - sort by number of references.
UpdateTime - sort by update time.
Sorting order:.
1 - ascending (ASC).
2 - descending (DESC).
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Common sort.
Supported sorting fields:.
CitationCount - sort by number of references.
UpdateTime - sort by update time.
Sorting order:.
1 - ascending (ASC).
2 - descending (DESC).
     * @param OrderFields Common sort.
Supported sorting fields:.
CitationCount - sort by number of references.
UpdateTime - sort by update time.
Sorting order:.
1 - ascending (ASC).
2 - descending (DESC).
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Universal filter criteria.
1. Id
Description: template ID.
Value: unique identifier of the template.

2. Keyword
Description: search by keyword, supports template name fuzzy search.
Value: string.

3. Type
Description: template type.
Value: 1 - system template; 2 - custom template; support multiple values (OR relationship).

4. QualityDim
Describes the quality detection dimension.
Valid values: 1 - accuracy; 2 - uniqueness; 3 - integrity; 4 - consistency; 5 - timeliness; 6 - validity. support multiple values (OR relationship).

5. SourceObjectType
Describes the applicable source data object type for rule.
Value: 1 - constant; 2 - offline table level; 3 - offline field level; 4 - database level. supports multiple values (OR relationship).

6. SourceEngineTypes
Description: specifies the source data engine type to which the template applies.
Value: 1 - MySQL; 2 - Hive; 4 - Spark; 8 - Livy; 16 - DLC; 32 - Gbase; 64 - TCHouse-P; 128 - Doris; 256 - TCHouse-D; 512 - EMR_StarRocks; 1024 - TCHouse-X. supports multiple values (OR relationship).
 
     * @return Filters Universal filter criteria.
1. Id
Description: template ID.
Value: unique identifier of the template.

2. Keyword
Description: search by keyword, supports template name fuzzy search.
Value: string.

3. Type
Description: template type.
Value: 1 - system template; 2 - custom template; support multiple values (OR relationship).

4. QualityDim
Describes the quality detection dimension.
Valid values: 1 - accuracy; 2 - uniqueness; 3 - integrity; 4 - consistency; 5 - timeliness; 6 - validity. support multiple values (OR relationship).

5. SourceObjectType
Describes the applicable source data object type for rule.
Value: 1 - constant; 2 - offline table level; 3 - offline field level; 4 - database level. supports multiple values (OR relationship).

6. SourceEngineTypes
Description: specifies the source data engine type to which the template applies.
Value: 1 - MySQL; 2 - Hive; 4 - Spark; 8 - Livy; 16 - DLC; 32 - Gbase; 64 - TCHouse-P; 128 - Doris; 256 - TCHouse-D; 512 - EMR_StarRocks; 1024 - TCHouse-X. supports multiple values (OR relationship).

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Universal filter criteria.
1. Id
Description: template ID.
Value: unique identifier of the template.

2. Keyword
Description: search by keyword, supports template name fuzzy search.
Value: string.

3. Type
Description: template type.
Value: 1 - system template; 2 - custom template; support multiple values (OR relationship).

4. QualityDim
Describes the quality detection dimension.
Valid values: 1 - accuracy; 2 - uniqueness; 3 - integrity; 4 - consistency; 5 - timeliness; 6 - validity. support multiple values (OR relationship).

5. SourceObjectType
Describes the applicable source data object type for rule.
Value: 1 - constant; 2 - offline table level; 3 - offline field level; 4 - database level. supports multiple values (OR relationship).

6. SourceEngineTypes
Description: specifies the source data engine type to which the template applies.
Value: 1 - MySQL; 2 - Hive; 4 - Spark; 8 - Livy; 16 - DLC; 32 - Gbase; 64 - TCHouse-P; 128 - Doris; 256 - TCHouse-D; 512 - EMR_StarRocks; 1024 - TCHouse-X. supports multiple values (OR relationship).

     * @param Filters Universal filter criteria.
1. Id
Description: template ID.
Value: unique identifier of the template.

2. Keyword
Description: search by keyword, supports template name fuzzy search.
Value: string.

3. Type
Description: template type.
Value: 1 - system template; 2 - custom template; support multiple values (OR relationship).

4. QualityDim
Describes the quality detection dimension.
Valid values: 1 - accuracy; 2 - uniqueness; 3 - integrity; 4 - consistency; 5 - timeliness; 6 - validity. support multiple values (OR relationship).

5. SourceObjectType
Describes the applicable source data object type for rule.
Value: 1 - constant; 2 - offline table level; 3 - offline field level; 4 - database level. supports multiple values (OR relationship).

6. SourceEngineTypes
Description: specifies the source data engine type to which the template applies.
Value: 1 - MySQL; 2 - Hive; 4 - Spark; 8 - Livy; 16 - DLC; 32 - Gbase; 64 - TCHouse-P; 128 - Doris; 256 - TCHouse-D; 512 - EMR_StarRocks; 1024 - TCHouse-X. supports multiple values (OR relationship).

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListQualityRuleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQualityRuleTemplatesRequest(ListQualityRuleTemplatesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

