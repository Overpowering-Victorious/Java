package methods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import entity.Candidate;

//getCount(List<Candidate> list):
//    return type: Map<String, Long>
//    visibility: public
//   getAverageAge(List<Candidate> list):
//    return type: Map<String, Double>
//    visibility: public
//   countCandidatesDepartmentWise(List<Candidate> list):
//    return type: Map<String, Long>
//    visibility: public
//   getYoungestCandidateDetails(List<Candidate> list)
//   return type: Optional<Candidate> 
//   visibility: public

public class Implementation {

	public Map<String, Long> getCount(List<Candidate> list)
	{
		Map<String,Long> count=new HashMap<String, Long>();
		for(Candidate c: list)
		{
			count.put(c.getGender(), count.getOrDefault(c.getGender(), 0L)+1);
		}
		return count;
	}
	
	public Map<String,Double> getAverageAge(List<Candidate> list)
	{
		Map<String,Long> count=getCount(list);
		Map<String, Double> avg=new HashMap<String, Double>();
		for(Candidate c: list)
		{
			avg.put(c.getGender(), avg.getOrDefault(c.getGender(),0.0)+c.getAge());
		}
		for(Map.Entry<String, Double> e: avg.entrySet())
		{
			avg.put(e.getKey(), e.getValue()/count.get(e.getKey()));
		}
		return avg;
	}
	
	public Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list)
	{
		Map<String,Long> countByDept=new HashMap<String, Long>();
		for(Candidate c: list)
		{
			countByDept.put(c.getDepartment(), countByDept.getOrDefault(c.getDepartment(), 0L)+1);
		}
		return countByDept;
	}
	
	public Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
	{
		Candidate c=new Candidate();
		c.setAge((int)1e9);
		for(Candidate cd: list)
		{
			if(c.getAge()>cd.getAge())
				c=cd;
		}
		Optional<Candidate>ans=Optional.of(c);
		return ans;
	}
}
