package cn.ffcs.tsp.msa.mybatis.service.scatter;

import java.util.List;

import cn.ffcs.tsp.msa.mybatis.dto.ScatterDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenGmDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenQylxDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzDTO;
import cn.ffcs.tsp.msa.mybatis.dto.visualShow.FarenXzqDTO;

public interface IScatterService {

	void saveScatter(List<ScatterDTO> dto);

}
